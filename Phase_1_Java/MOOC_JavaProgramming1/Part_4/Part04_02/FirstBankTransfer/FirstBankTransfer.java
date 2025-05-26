package Part04_02.FirstBankTransfer;

public class FirstBankTransfer {

    public static void main(String[] args) {

        Account matthewsAccount = new Account("Matthew's Account", 1000);
        Account myAccount = new Account("My Account", 0);

        matthewsAccount.withdrawal(100.00);
        System.out.println("Withdrawing 100.00 from Matthew's account");

        myAccount.deposit(100.00);
        System.out.println("Depositing 100.00 to my account");

        System.out.println();
        System.out.println("Matthew - Final Balance: " + matthewsAccount.saldo());
        System.out.println("My Account - Final Balance: " + myAccount.saldo());
    }
}
