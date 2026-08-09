import java.util.Scanner;

public class StudentPerformanceAnalyzer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = input.nextLine();

        int[] marks = new int [10];
        
        for (int i = 0; i < marks.length; i++) {
            System.out.print("Enter subject " + (i+1) + " marks: ");
            marks[i] = input.nextInt();
        }

        header(name);
        printMarks(marks);
        int total = printTotal(marks);
        printAverage(marks, total);
        printMinMax(marks);
        printPassFail(marks);
        
        input.close();
    }

    public static void header(String name) {
        System.out.println("---- " + name + "'s Performance ----");
    }

    public static void printMarks(int[] marks) {
        System.out.print("Marks: ");
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i]);

            if (i < (marks.length - 1)) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
    
    public static int printTotal(int[] marks) {
        int total = 0;
        for (int i = 0; i < marks.length; i++) {
            total = total + marks[i];
        }
        System.out.println("Total: " + total);
        return total;
    }

    public static void printAverage(int[] marks, int total) {
        double avg = (double)total / marks.length;
        System.out.println("Average: " + avg);
    } 

    public static void printMinMax(int[] marks) {
        int min = marks[0], max = marks[0];
        for (int i = 0; i < marks.length; i++) {
            if (min >= marks[i]) {
                min = marks[i];
            }
            if (max <= marks[i]) {
                max = marks[i];
            }
        }
        System.out.println("Minimum mark: " + min);
        System.out.println("Maximum mark: " + max);
    }

    public static void printPassFail(int[] marks) {
        int pass = 0, fail = 0;
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] >= 50) {
                pass++;
            }
            else {
                fail++;
            }
        }
        System.out.println("Passed: " + pass);
        System.out.println("Failed: " + fail);
    }
}
