package J01Functions;
/*
Write a Java method to calculate the hypotenuse of a right triangle based on value of 2 legs.
Example:
For leg1 = 3, leg2 = 4 , the return value of the method is 5
Input: 2 integers leg1, leg2
1 ≤ leg1, leg2 ≤ 1000000
Output: the value of hypotenuse
Execution time limit: 1 second
 */
public class Functions02 {
    static int calculateHypotenuse(int leg1, int leg2) {
        int sum = (leg1 * leg1) + (leg2 * leg2);
        return (int) Math.sqrt(sum);
    }

    public static void main(String[] args) {
        System.out.println(calculateHypotenuse(3, 4));
    }
}
