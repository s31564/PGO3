public class Tester extends Employee {
    int testBonus;

    public Tester(String firstName, String lastName, String address, String email, String pesel, int yearOfEmployment, int testBonus) {
        super(firstName, lastName, address, email, pesel, yearOfEmployment);
        this.testBonus = testBonus;
    }

    @Override
    public int calculateSalary() {
        return super.calculateSalary() + testBonus;
    }
}