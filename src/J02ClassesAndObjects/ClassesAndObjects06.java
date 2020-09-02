package J02ClassesAndObjects;

import java.util.Scanner;

/*
Write a Java program to show that a triangle is an isosceles triangle or not.
Example:
For side1 = 5, side2 = 5, side3 = 7, output should be printed on the screen The triangle is an isosceles triangle
For side1 = 3, side2 = 4, side3 = 5, output should be printed on the screen The triangle is not an isosceles triangle
Input: 3 integer side1, side2, side3 enter from keyboard
Guaranteed constraints:
1 ≤ side1, side2, side3 ≤ 100000
Output: print on the screen The triangle is an isosceles triangle or The triangle is not an isosceles triangle
Execution time limit: 1 second
 */
public class ClassesAndObjects06 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Triangle triangle = new Triangle();
        triangle.side1 = reader.nextInt();
        triangle.side2 = reader.nextInt();
        triangle.side3 = reader.nextInt();
        System.out.println(triangle.result());
    }
}

class Triangle {
    public int side1;
    public int side2;
    public int side3;
    public String result() {
        if (side1 == side2 || side2 == side3) {
            return "The triangle is an isosceles triangle";
        } else {
            return "The triangle is not an isosceles triangle";
        }
    }
}