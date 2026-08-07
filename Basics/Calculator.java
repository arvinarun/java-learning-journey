import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean loopCal = true;

        do {
            System.out.println("\n===== Calculator =====");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.print("Choose an option: ");
            int choice = input.nextInt();
            double result = 0;

            System.out.print("Enter number 1: ");
            double x = input.nextDouble();
            System.out.print("Enter number 2: ");
            double y = input.nextDouble();

            switch(choice) {
                case 1:
                    result = add(x,y);
                    break;
                case 2:
                    result = subtract(x,y);
                    break;
                case 3:
                    result = multiply(x,y);
                    break;
                case 4:
                    result = divide(x,y);
                    break;
                default:
                    System.out.println("Enter a valid choice");
                    break;

            }
            
            System.out.printf("Result: %.2f%n", result);
            System.out.println("Calculate again(y/n)?: ");
            char again = input.next().charAt(0);

            if(again == 'n') {
                loopCal = false;
            }
            else if(again == 'y') {
            }
            else {
                System.out.println("Enter valid choice");
                break;
            }

        } while(loopCal);

        input.close();
    }

    public static double add(double x, double y) {
        return x + y;
    }

    public static double subtract(double x, double y) {        
        return x-y;
    }

    public static double multiply(double x, double y) {
        return x * y;
    }

    public static double divide(double x, double y) {
        if (y == 0) {
            System.out.println("Error: Cannot divide by zero.");
            return 0;
        }
        else {
            return x / y;
        }
    }


}
