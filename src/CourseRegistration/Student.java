package CourseRegistration;

class Student {
    String regNo;
    String name;

    Student(String regNo, String name) {
        this.regNo = regNo;
        this.name = name;
    }

    public String toString() {
        return regNo + " - " + name;
    }
}

