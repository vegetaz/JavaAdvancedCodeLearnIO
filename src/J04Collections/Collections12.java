package J04Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
Write a Java method to remove all occurrences of a specific value from a list and return the size of list after removing
Example:
For list = [1,2,3,4,3] and the element=3, the return value of the method is 3
Input: a list of integers and an integer element
Output: the size of list after removing all occurrences of element
Execution time limit: 1 second
 */
public class Collections12 {
    public static int removeAll(int[] list, int element) {
        List<Integer> aList = new ArrayList<>();
        for (int i : list) {
            aList.add(i);
        }
        List<Integer> bList = new ArrayList<>();
        bList.add(element);
        aList.removeAll(bList);
        return aList.size();
    }

    public static void main(String[] args) {
        int[] list = {1, 2, 3};
        System.out.println(removeAll(list, 1));
    }
}
