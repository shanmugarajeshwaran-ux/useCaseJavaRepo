package EmployeeTaskAssignment;

import java.util.ArrayList;

public class EmployeeManagment {

    private ArrayList<EmployeeDetails> Emp = new ArrayList<>();
    
    public void create(int empId, String eName, int age, double salary, String dOJ) {
        Emp.add(new EmployeeDetails(empId, eName, age, salary, dOJ));
    }

    public void assignTask(int empId, String taskName) {
        for (EmployeeDetails e : Emp) {
            if (e.empId == empId) {
                e.addTask(taskName);
                return;
            }
        }
        System.out.println("Employee with ID " + empId + " not found.");
    }
    
    public void fetchAll() {
        System.out.println("\n--- Employee Details & Tasks ---");
        for(EmployeeDetails d : Emp) {
            System.out.println(d);
        }
        System.out.println("----------------------------------\n");
    }
    
    public static void main(String[] args) {
        EmployeeManagment em = new EmployeeManagment();
        
        em.create(101, "shanmuga", 21, 20000, "5-feb-2026");
        em.create(102, "surya", 22, 26000, "01-feb-2026");

       
        em.assignTask(101, "Fix Login Bug");
        em.assignTask(101, "Update Documentation");
        em.assignTask(101, "Fix Login Bug");
        
        em.assignTask(102, "Database Migration");
        em.assignTask(102, "Database Migration");

        em.fetchAll();
    }
}