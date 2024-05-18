public class Employee {
    String firstName;
    String lastName;
    String address;
    String email;
    String pesel;
    int yearOfEmployment;

    public Employee(String firstName, String lastName, String address, String email, String pesel, int yearOfEmployment) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.email = email;
        this.pesel = pesel;
        this.yearOfEmployment = yearOfEmployment;
    }

    public int calculateSalary() {
        int yearsWorked = 2024 - yearOfEmployment;
        return 3000 + yearsWorked * 1000;
    }
}