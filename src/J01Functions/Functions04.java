package J01Functions;
/*
Write a Java method that return a String contains all characters between two characters in Alphabet (inclusive).
Example:
For start='B', end='D', the method return String "BCD"
For start='G', end='M', the method return String "GHIJKLM"
Input: 2 char arguments start and end
Guaranteed constraints:
'A' ≤ start ≤ end ≤ 'Z'
Output: A String contains all characters between start and end (inclusive).
Execution time limit: 1 second
 */
public class Functions04 {
    static String generateAlphabet(char start, char end) {
        StringBuilder str = new StringBuilder();
        for (char c = start; c <= end; c++) {
            str.append(c);
        }
        return str.toString();
    }

    public static void main(String[] args) {
        System.out.println(generateAlphabet('A', 'Z'));
    }
}
