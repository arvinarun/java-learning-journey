import java.util.Scanner;

public class LoginAnalyzer {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("---- Welcome ----");
        boolean welcomeLoop = true; 
        do {
            System.out.print("Enter username: ");
            String loginUsername = input.nextLine();
            int usernameIndex = usernameCheck(loginUsername);
            if (usernameIndex >= 0) {
                welcomeLoop = false;
                int passwordTrys = 3;
                do {
                    System.out.print("Enter password: ");
                     String loginPassword = input.nextLine();
                     boolean passwordValid = passwordCheck(loginPassword, usernameIndex);
                    if (passwordValid) {
                        welcomeMessage(usernameIndex);
                        break;
                    }
                    else {
                        System.out.println("Incorrect password, try again. You have " + --passwordTrys + " trys left");
                    }
                    } while (passwordTrys != 0);
                if (passwordTrys == 0) {
                    System.out.println("Too many incorrect trys. Try again later");
                    break;
                } 
            }
            else {
                System.out.println("Invalid username, try again");
            }  
        } while (welcomeLoop); 
    }   

    public static int usernameCheck(String loginUsername) {
        String[] usernames = {"Arvin", "Adam", "Bob", "Peter"};
        int usernameIndex = -1;
        for (usernameIndex = 0; usernameIndex < usernames.length; usernameIndex++) {
            if (loginUsername.equalsIgnoreCase(usernames[usernameIndex])) {
                return usernameIndex;
            }
        }
        return usernameIndex;
    }

    public static boolean passwordCheck(String loginPassword, int usernameIndex) {
        String[] passwords = {"aeafhbk", "asdgs", "hdfssdh", "vsdfsd"};
        if (loginPassword.equals(passwords[usernameIndex])) {
            return true;
        }
        return false;
    }

    public static void welcomeMessage(int usernameIndex) {
        String[] usernames = {"Arvin", "Adam", "Bob", "Peter"};
        System.out.println("Hello " + usernames[usernameIndex]);
    }
}
