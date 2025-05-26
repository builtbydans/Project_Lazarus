package Part04_08.Debt;

public class MainProgram {
    public static void main(String[] args) {

        Debt mortgage = new Debt(120000.0, 1.01);
        System.out.print("Opening Balance: ");
        mortgage.printBalance();

        mortgage.waitOneYear();
        System.out.print("Balance + 1 Year Interest: ");
        mortgage.printBalance();

        int years = 0;

        while (years < 20) {
            mortgage.waitOneYear();
            years = years + 1;
        }

        System.out.print("Balance + 20 Year Interest: ");
        mortgage.printBalance();
    }
}
