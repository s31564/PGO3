public class Developer extends Employee {
    int techBonus;

    public Developer(String firstName, String lastName, String address, String email, String pesel, int yearOfEmployment, int techBonus) {
        super(firstName, lastName, address, email, pesel, yearOfEmployment);
        this.techBonus = techBonus;
    }

    @Override
    public int calculateSalary() {
        return super.calculateSalary() + techBonus;
    }
}