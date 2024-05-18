public class Manager extends Employee {
    int goalBonus;

    public Manager(String firstName, String lastName, String address, String email, String pesel, int yearOfEmployment, int goalBonus) {
        super(firstName, lastName, address, email, pesel, yearOfEmployment);
        this.goalBonus = goalBonus;
    }

    @Override
    public int calculateSalary() {
        return super.calculateSalary() + goalBonus;
    }
}