package Homework.Homework5;

public class Employee {
    static int idCounter = 1;
    int id;
    String surname;
    String name;
    int age;
    double salary;
    String department;

    // Constructor to initialize an Employee and increment the id
    public Employee(String surname, String name, int age, double salary, String department) {
        this.id = idCounter++;
        this.surname = surname;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.department = department;
    }

    // Method to double the salary
    public void salaryGrowToDouble() {
        this.salary = this.salary * 2;
        System.out.println("New doubled salary is: " + this.salary);
    }

    // Method to show employee information
    void showInfoEmployee() {
        System.out.println("Employee ID number: " + this.id);
        System.out.println("Employee name: " + this.name);
        System.out.println("Employee surname: " + this.surname);
        System.out.println("Employee age: " + this.age);
        System.out.println("Employee salary: " + this.salary);
        System.out.println("Employee department: " + this.department);
    }
}

class EmployeeTest {
    public static void main(String[] args) {
        // Create an Employee instance
        Employee e1 = new Employee("Jdanov", "Ilya", 28, 25000, "Marketing department");

        // Show initial employee information
        e1.showInfoEmployee();

        // Double the salary
        e1.salaryGrowToDouble();

        System.out.println("-----------------------------------------------------");

        Employee e2 = new Employee("Lena", "Pani", 25, 30000, "Chief Accountant");
        e2.showInfoEmployee();
        e2.salaryGrowToDouble();

    }
}




