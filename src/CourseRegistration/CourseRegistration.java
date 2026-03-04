package CourseRegistration;

import java.util.ArrayList;

public class CourseRegistration {
    private String courseCode;
    private ArrayList<Student> enrolled = new ArrayList<>();

    public CourseRegistration(String courseCode) {
        this.courseCode = courseCode;
    }

    public void enroll(String regNo, String name) {
        enrolled.add(new Student(regNo, name));
    }

    public boolean unenroll(String regNo) {
        for (int i = 0; i < enrolled.size(); i++) {
            if (enrolled.get(i).regNo.equals(regNo)) {
                enrolled.remove(i);
                return true;
            }
        }
        return false;
    }

    public boolean isEnrolled(String regNo) {
        for (Student s : enrolled) if (s.regNo.equals(regNo)) return true;
        return false;
    }

    public int count() {
        return enrolled.size();
    }

    public void listStudents() {
        System.out.println(courseCode + " Enrolled:");
        for (Student s : enrolled) System.out.println(s);
    }

    public static void main(String[] args) {
        CourseRegistration cr = new CourseRegistration("CS101");
        cr.enroll("22A001", "Karthik");
        cr.enroll("22A002", "Meera");
        cr.enroll("22A003", "Naveen");
        System.out.println(cr.isEnrolled("22A002"));
        cr.unenroll("22A001");
        System.out.println(cr.count());
        cr.listStudents();
    }
}

