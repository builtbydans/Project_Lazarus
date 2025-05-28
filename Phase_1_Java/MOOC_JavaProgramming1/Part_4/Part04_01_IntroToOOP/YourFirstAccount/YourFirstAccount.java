package Part04_01_IntroToOOP.YourFirstAccount;

public class YourFirstAccount {

    public static void main(String[] args) {
        Account artosAccount = new Account("Arto's account", 100.00);

        System.out.println(artosAccount);

        artosAccount.deposit(20);
        System.out.println("Depositing 20.00");
        System.out.println();
        System.out.println("The balance of Arto's account is now: " + artosAccount.saldo());
    }
}
