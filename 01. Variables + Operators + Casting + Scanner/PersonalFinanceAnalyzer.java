import java.util.Scanner;

public class PersonalFinanceAnalyzer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter monthly income: ");
        double monthlyIncome = input.nextDouble();

        System.out.print("Enter rent: ");
        double monthlyRentC = input.nextDouble();

        System.out.print("Enter food cost: ");
        double monthlyFoodC = input.nextDouble();

        System.out.print("Enter transport cost: ");
        double monthlyTransportC = input.nextDouble();

        System.out.print("Enter entertainment cost: ");
        double monthlyEntertainC = input.nextDouble();

        double monthlyExpenses = monthlyRentC + monthlyFoodC + monthlyTransportC + monthlyEntertainC;

        double remainMoney = monthlyIncome - monthlyExpenses;

        double needsPercentage = ((monthlyRentC + monthlyFoodC + monthlyTransportC) / monthlyIncome) * 100;
        double wantsPercentage = (monthlyEntertainC / monthlyIncome) * 100;
        double savingPercentage = (remainMoney / monthlyIncome) * 100;

        System.out.println();
        System.out.println("---- Finance Analyzer ----");
        System.out.println("Total Income: " + monthlyIncome);
        System.out.println("Monthly Expenses: " + monthlyExpenses);
        System.out.println("Remaining Money: " + remainMoney);
        System.out.println("Income percentage spent on Needs: " + needsPercentage + "%");
        System.out.println("Income percentage spent on Wants: " + wantsPercentage + "%");
        System.out.println("Income percentage saved: " + savingPercentage + "%");

        input.close();
    }    
}
