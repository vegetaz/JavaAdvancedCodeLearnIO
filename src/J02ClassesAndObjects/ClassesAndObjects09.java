package J02ClassesAndObjects;

import java.util.Scanner;

/*
Write a Java program which is using nested class to show on the screen the value entered from keyboard.
Example:
For value = "CodeLearn", the output on screen should be: "The function of inner class is called by name: CodeLearn"
Input: a string value
Output: print on the screen "The function of inner class is called by name: " + value
Execution time limit: 1 second
 */
public class ClassesAndObjects09 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String value = reader.nextLine();
        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        innerClass.showMe(value);
    }
}

class OuterClass {
    class InnerClass {
        public void showMe(String value) {
            System.out.println("The function of inner class is called by name: " + value);
        }
    }
}
