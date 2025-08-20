import java.util.ArrayList;

public class BudgetTracker {
    private int expenseAmount;
    private ArrayList<Integer> expenses;

    public BudgetTracker(int expenseAmount, ArrayList<Integer> expenses) {
        this.expenseAmount = expenseAmount;
        this.expenses = new ArrayList<>();
    }

    public void addExpenses(int expense) {
        this.expenses.add(expense);
    }

    public int totalSpent() {
        int sum = 0;
        for (Integer expense : expenses) {
            sum += expense;
        }

        return sum;
    }

    public double averageExpense() {
        int sum = 0;

        for (Integer expense : expenses) {
            sum += expense;
        }

        return (double) sum / expenses.size();
    }

    public void breakDown() {
        int[] breakdown = new int[5];

        for (int expense : expenses) {
            if (expense < 50) {
                breakdown[0]++;
            } else if (expense < 60) {
                breakdown[1]++;
            } else if (expense < 70) {
                breakdown[2]++;
            } else if (expense < 80) {
                breakdown[3]++;
            } else if (expense < 90) {
                breakdown[4]++;
            } else {
                breakdown[5]++;
            }
        }

        for (int i = 4; i >= 0; i--) {
            System.out.print(i + ": ");
            for (int j = 0; j < breakdown[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public ArrayList<Integer> getExpenses() {
        return this.expenses;
    }
}
