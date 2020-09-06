package J04Collections;

import java.util.LinkedList;

/*
Write a Java method use LinkedList to convert the input array into new array that contains distinct adjacent elements.
Example:
For list = ["A", "B", "C", "C", "D"] the return list is ["A", B", "C", D"]
Input: an array of String inputArr  0 < inputArr.length < 100
Output: the array that contains distinct adjacent elements with value from inputArr
Execution time limit: 1 second
 */
public class Collections13 {
    static String[] distincAdjacent(String[] inputArr) {
        LinkedList<String> aList = new LinkedList<>();
//        for (int i = 0; i < inputArr.length; i++) {
//            aList.add(inputArr[i]);
//        }
        return aList.toArray(new String[10]);
    }

    public static void main(String[] args) {
        String[] inputArr = {"A", "B", "C", "C", "D"};
        System.out.println(distincAdjacent(inputArr));
    }
}
