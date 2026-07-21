import java.util.Scanner;

public class ATMSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double balance = 4760839.88;
        String username = "Arvin";
        int pin = 2870;

        System.out.print("Enter Username: ");
        String tempUsername = input.nextLine();

        System.out.print("Enter pin: ");
        int tempPin = input.nextInt();

        if(!tempUsername.equals(username) || tempPin != pin) {
            System.out.println();
            System.out.println("Access Denied");
        }
        else {
            System.out.println();
            System.out.println("---- Welcome " + tempUsername + " ----");
            System.out.println();
            System.out.println("What would you like to do?");
            System.out.println("1. Withdraw\n2. Deposit\n3. Check Balance");
            int choice = input.nextInt();
            System.out.println();

            if(choice == 1) {
                System.out.print("How much would u like to withdraw?");
                double withdrawAmount = input.nextDouble();

                if(withdrawAmount>=10) {
                    if(balance >= withdrawAmount) {
                        balance = balance - withdrawAmount;
                        System.out.println("You have withdrawn $" + withdrawAmount);
                        System.out.println("Your account balance is: " + balance);                                      
                    }
                    else {
                        System.out.println("Insufficent account balance");
                    }
                }
                else {
                    System.out.println("Minimum withdrawal amount is $10");
                }
            }
            else if(choice == 2) {
                System.out.print("How much much would you like to deposit?");
                double depositAmount = input.nextDouble();

                if(depositAmount>=10) {
                    balance = balance + depositAmount;
                    System.out.println("Place $" + depositAmount + " in the cash tray");
                    System.out.println("Your account balance is: " + balance);   
                }
                else {
                    System.out.println("Minimum deposit amount is $10");
                }            
            }
            else if(choice == 3) {
                System.out.println("Your account balance is: " + balance);
            }
            else {
                System.out.println("Invalid choice");
            }
        }
        System.out.println("Thank you, have a good day!");
    input.close();
    }
}