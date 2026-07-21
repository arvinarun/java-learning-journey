import java.util.Scanner;

public class PersonalFinanceAnalyzer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter monthly income: ");
        double monthlyIncome = input.nextDouble();

        System.out.print("Enter rent: ");
        double monthlyRent = input.nextDouble();

        System.out.print("Enter food cost: ");
        double monthlyFood = input.nextDouble();

        System.out.print("Enter transport cost: ");
        double monthlyTransport = input.nextDouble();

        System.out.print("Enter entertainment cost: ");
        double monthlyEntertain = input.nextDouble();

        double monthlyExpenses = monthlyRent + monthlyFood + monthlyTransport + monthlyEntertain;

        double remainingMoney = monthlyIncome - monthlyExpenses;

        double needsPercentage = ((monthlyRent + monthlyFood + monthlyTransport) / monthlyIncome) * 100;
        double wantsPercentage = (monthlyEntertain / monthlyIncome) * 100;
        double savingPercentage = (remainingMoney / monthlyIncome) * 100;

        System.out.println();
        System.out.println("---- Finance Analyzer ----");
        System.out.println("Total Income: " + monthlyIncome);
        System.out.println("Monthly Expenses: " + monthlyExpenses);
        System.out.println("Remaining Money: " + remainingMoney);
        System.out.println("Income percentage spent on Needs: " + needsPercentage + "%");
        System.out.println("Income percentage spent on Wants: " + wantsPercentage + "%");
        System.out.printf("Income percentage saved: %.2f%% %n", savingPercentage);

        input.close();
    }    
}
