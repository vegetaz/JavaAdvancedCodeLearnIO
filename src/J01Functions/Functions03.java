package J01Functions;

import java.util.Scanner;

/*
Write a Java program that prints out Welcome to codelearn.io n times based on user input.
Example:
For n=2, output should be printed on the screen: Welcome to codelearn.io\nWelcome to codelearn.io
Input: an integer n entered from keyboard
Guaranteed constraints:
1 ≤ n ≤ 100000
Output: print on the screen Welcome to codelearn.io n times.
Execution time limit: 1 second
 */
public class Functions03 {
    private static void printOut() {
        System.out.println("Welcome to codelearn.io");
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        for (int i = 1; i <= n; i++) {
            printOut();
        }
    }
}
