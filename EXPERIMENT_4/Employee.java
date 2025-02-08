public class Employee {
    String name;
    int yearOfJoining;
    String address;

    public Employee(String name, int yearOfJoining, String address) {
        this.name = name;
        this.yearOfJoining = yearOfJoining;
        this.address = address;
    }

    public void printEmployeeInfo() {
        System.out.println(name + "\t" + yearOfJoining + "\t" + address);
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee("Ujwal", 2024, "BBS");
        Employee emp2 = new Employee("Ravi", 2023, "KUR");
        
        System.out.println("Name\tYear of joining\tAddress");
        emp1.printEmployeeInfo();
        emp2.printEmployeeInfo();
    }
}
