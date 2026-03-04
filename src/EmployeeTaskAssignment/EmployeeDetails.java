package EmployeeTaskAssignment;

import java.util.HashSet;
import java.util.Set;

public class EmployeeDetails {
    int empId;
    String eName;
    int age;
    double salary;
    String DOJ;
   
    Set<String> tasks = new HashSet<>(); 

    public EmployeeDetails(int empId, String eName, int age, double salary, String dOJ) {
        this.empId = empId;
        this.eName = eName;
        this.age = age;
        this.salary = salary;
        this.DOJ = dOJ;
    }

   
    public void addTask(String taskName) {
        if (!tasks.add(taskName)) {
            System.out.println("Note: Task '" + taskName + "' already exists for " + eName);
        }
    }
    

    @Override
    public String toString() {
        return "ID: " + empId + " | Name: " + eName + " | Tasks: " + tasks;
    }
}