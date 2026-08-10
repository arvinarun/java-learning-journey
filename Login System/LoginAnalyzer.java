import java.util.Scanner;

public class LoginAnalyzer {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        String[] usernames = {"Arvin", "Adam", "Bob", "Peter"};
        System.out.println("---- Welcome ----");
        boolean welcomeLoop = true; 
        do {
            System.out.print("Enter username: ");
            String loginUsername = input.nextLine();
            int usernameIndex = usernameCheck(loginUsername, usernames);
            if (usernameIndex >= 0) {
                welcomeLoop = false;
                int passwordTrys = 3, successTrys = 0, failTrys = 0;
                String login = "NULL";
                do {
                    System.out.print("Enter password: ");
                     String loginPassword = input.nextLine();
                     boolean passwordValid = passwordCheck(loginPassword, usernameIndex);
                    if (passwordValid) {
                        successTrys++;
                        login = "SUCCESS";
                        welcomeMessage(usernameIndex, usernames);
                    }
                    else {
                        failTrys++;
                        System.out.println("Incorrect password, try again. You have " + --passwordTrys + " trys left");
                    }
                } while (passwordTrys != 0);
                if (passwordTrys == 0) {
                    login = "FAILED";
                    System.out.println("Too many incorrect trys. Try again later");
                }
                loginLog(usernameIndex, login, usernames);
                break;
            }
            else {
                System.out.println("Invalid username, try again");
            }  
        } while (welcomeLoop);

        input.close();
    }   

    public static int usernameCheck(String loginUsername, String[] usernames) {
        for (int usernameIndex = 0; usernameIndex < usernames.length; usernameIndex++) {
            if (loginUsername.equalsIgnoreCase(usernames[usernameIndex])) {
                return usernameIndex;
            }
        }
        return -1;
    }

    public static boolean passwordCheck(String loginPassword, int usernameIndex) {
        String[] passwords = {"aeafhbk", "asdgs", "hdfssdh", "vsdfsd"};
        return loginPassword.equals(passwords[usernameIndex]);
    }

    public static void welcomeMessage(int usernameIndex, String[] usernames) {
        System.out.println("Hello " + usernames[usernameIndex]);
    }

    public static void loginLog(int usernameIndex, String login, String[] usernames) {
        String[] log = new String[10];
        int loginCount = 0;
        log[loginCount] = "LOGIN:" + usernames[usernameIndex] + ":" + login;
        loginCount++;
    }
}
