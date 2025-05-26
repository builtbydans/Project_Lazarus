package Part04_12.PaymentCard;

public class PaymentCard {
    private double balance;

    public PaymentCard(double balance) {
        this.balance = balance;
    }

    public void eatAffordably() {
        if (this.balance > 0) {
            this.balance = this.balance - 2.6;
        }
    }

    public void eatHeartily() {
        if (this.balance > 4.6) {
            this.balance = this.balance - 4.6;
        }
    }

    public void addMoney(double money) {
        if (money < 0) {
            return;
        }

        this.balance += money;

        if (this.balance > 150) {
            this.balance = 150;
        }
    }


    public String toString() {
        return "This card has a balance of " + balance + " euros";
    }
}
