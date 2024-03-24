package CIE_1.G3;

// Main.java
public class Main {
    public static void main(String[] args) {
        // Employee details
        Employee emp = new Employee("John Doe", 101, 50000);
        emp.displayDetails();

        // DevOps Engineer details
        DevOpsEngineer devOps = new DevOpsEngineer("Jane Smith", 102, 60000, 10000);
        devOps.displayDetails();
    }
}
