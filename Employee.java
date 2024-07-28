package com.assignment11;

public class Employee {
    //2. Similiarly, add constructor to the Employee class already created to add and display.
    private String name;
    private float salary;
    private int empId;
    static int empCount = 0;

    {
        empCount++;
    }
    public Employee(String name, float salary, int empId) {
        this.name = name;
        this.salary = salary;
        this.empId = empId;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public float getSalary() {
        return salary;
    }

    public int getEmpId() {
        return empId;
    }

    public static int getEmpCount() {
        return empCount;
    }
    public void display(){
        System.out.println("Name: "+this.name);
        System.out.println("Salary: "+this.salary);
        System.out.println("Employee ID: "+this.empId);
    }

    public static void main(String[] args) {
        Employee employees[]=new Employee[3];
        employees[0]=new Employee("Alex",23095,1001);
        employees[1]=new Employee("Tory",250000,1002);
        employees[2]=new Employee("Jen",350000,1003);
        for (Employee e:employees){
            e.display();
            System.out.println();
        }
    }
}
