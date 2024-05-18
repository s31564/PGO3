public class Main {
    public static void main(String[] args) {
        Employee dev = new Developer("Jan", "Kowalski", "Warsaw", "jan@kow.com", "123456789", 2010, 100);
        Employee tester = new Tester("Anna", "Kowalska", "Krakow", "anna@kow.com", "987654321", 2011, 200);
        Employee manager = new Manager("Artur", "Nowak", "Poznan", "artur@now.com", "1122334455", 2009, 150);

        int totalAmount = dev.calculateSalary() + tester.calculateSalary() + manager.calculateSalary();

        System.out.println("Total amount to be paid this month: " + totalAmount + " PLN");
    }
}
