import java.util.Scanner;

public class LoginAnalyzer {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        String[] usernames = {"Arvin", "Adam", "Bob", "Peter"};
        String[] passwords = {"aeafhbk", "asdgs", "hdfssdh", "vsdfsd"};
        String[] log = new String[10];
        int loginCount = 0;
        System.out.println("---- Welcome ----");
        boolean welcomeLoop = true; 
        do {
            System.out.print("Enter username: ");
            String loginUsername = input.nextLine();
            int usernameIndex = usernameCheck(loginUsername, usernames);
            if (usernameIndex >= 0) {
                int passwordTrys = 3;
                String login = "NULL";
                do {
                    System.out.print("Enter password: ");
                     String loginPassword = input.nextLine();
                     boolean passwordValid = passwordCheck(loginPassword, usernameIndex, passwords);
                    if (passwordValid) {
                        login = "SUCCESS";
                        welcomeMessage(usernameIndex, usernames);
                        break;
                    }
                    else {
                        System.out.println("Incorrect password, try again. You have " + --passwordTrys + " trys left");
                    }
                } while (passwordTrys != 0);
                if (passwordTrys == 0) {
                    login = "FAILED";
                    System.out.println("Too many incorrect trys. Try again later");
                }
                loginCount = loginLog(usernameIndex, login, usernames, log, loginCount);
            }
            else {
                System.out.println("Invalid username, try again");
            }  
            System.out.print("Would you like to print login log? (y/n): ");
            char printLog = input.next().charAt(0);
            input.nextLine();
            if (printLog == 'y') {
                printLog(log);
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

    public static boolean passwordCheck(String loginPassword, int usernameIndex, String[] passwords) {
        return loginPassword.equals(passwords[usernameIndex]);
    }

    public static void welcomeMessage(int usernameIndex, String[] usernames) {
        System.out.println("Hello " + usernames[usernameIndex]);
    }

    public static int loginLog(int usernameIndex, String login, String[] usernames, String[] log, int loginCount) {
        log[loginCount] = "LOGIN:" + usernames[usernameIndex] + ":" + login;
        loginCount++;
        return loginCount;
    }

    public static void printLog(String[] log) {
        for (int i = 0; i < log.length; i++) {
            if (log[i] != null) {
                System.out.println(log[i]);
            }
        }
    }
}
