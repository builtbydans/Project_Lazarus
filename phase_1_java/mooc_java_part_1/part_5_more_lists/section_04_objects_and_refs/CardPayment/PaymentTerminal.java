
public class PaymentTerminal {


    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals


    public PaymentTerminal() {
        // register initially has 1000 euros of money
        this.money = 1000;
    }

    public double eatAffordably(double payment) {
        return processCashPayment(payment, 2.5, true);
    }

    public double eatHeartily(double payment) {
        return processCashPayment(payment, 4.3, false);
    }

    public boolean eatAffordably(PaymentCard card) {
        if (card.takeMoney(2.5)) {
            this.affordableMeals++;
            return true;
        }
        return false;
    }

    public boolean eatHeartily(PaymentCard card) {
        if (card.takeMoney(4.3)) {
            this.heartyMeals++;
            return true;
        }
        return false;
    }

    private double processCashPayment(double payment, double price, boolean isAffordable) {
        if (payment >= price) {
            this.money += price;
            if (isAffordable) {
                this.affordableMeals++;
            } else {
                this.heartyMeals++;
            }
            return payment - price;
        }
        return payment;
    }

    public void addMoneyToCard(PaymentCard card, double sum) {
        if (sum > 0) {
            card.addMoney(sum);
            this.money += sum;
        }
    }

    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
