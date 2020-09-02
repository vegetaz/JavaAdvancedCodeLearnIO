package J02ClassesAndObjects;

import java.util.Scanner;

/*
Write a Java program to calculate the perimeter of a triangle.
Example:
For side1 = 5, side2 = 5, side3 = 7, output should be printed on the screen 17
For side1 = 3, side2 = 4, side3 = 5, output should be printed on the screen 12
Input: 3 integer side1, side2, side3 enter from keyboard
Guaranteed constraints:
1 ≤ side1, side2, side3 ≤ 100000
Output: print on the screen the perimeter of a triangle.
Execution time limit: 1 second
 */
public class ClassesAndObjects07 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Triangle07 triangle = new Triangle07(reader.nextInt(), reader.nextInt(), reader.nextInt());
        System.out.println(triangle.perimeter());
    }
}

class Triangle07 {
    public int side1;
    public int side2;
    public int side3;

    public Triangle07(int side1, int side2, int side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public int perimeter() {
        return side1 + side2 + side3;
    }
}
