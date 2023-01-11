package com.company;

class Employee1{
    int id;
    String name;
    int salary;
    public void printDetails(){
        System.out.println("My id is " + id);
        System.out.println("and my name is " + name);
    }
    public int getSalary(){
        return salary;
    }
}
public class cwh_38_custom_class {
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        Employee1 bhavya = new Employee1();//Instantiating a new Employee object
        Employee1 john = new Employee1();

        // Setting Attributes for bhavya
        bhavya.id = 12;
        bhavya.name = "codeWithBhavya";
        bhavya.salary = 50000;
        // Setting Attributes for john
        john.id = 17;
        john.name = "john tripathi";
        john.salary = 20000;

        // printing the Attributes
        bhavya.printDetails();
        john.printDetails();
        int salary = john.getSalary();
        System.out.println(salary);
        //System.out.println(bhavya.id);
        //System.out.println(bhavya.name);

    }
}
