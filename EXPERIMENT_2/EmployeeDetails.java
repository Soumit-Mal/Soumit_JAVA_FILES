import java.util.Scanner;

class Employee {
    String name;
    int id;
    double salary;

    void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
    }
}

public class EmployeeDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee[] employees = new Employee[5];

        for (int i = 0; i < 5; i++) {
            employees[i] = new Employee();
            System.out.println("Enter details for Employee " + (i + 1));
            System.out.print("ID: ");
            employees[i].id = sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            employees[i].name = sc.nextLine();
            System.out.print("Salary: ");
            employees[i].salary = sc.nextDouble();
        }

        System.out.println("\nEmployee Details:");
        for (Employee emp : employees) {
            emp.display();
        }
        sc.close();
    }
}
