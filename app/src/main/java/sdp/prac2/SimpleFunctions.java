package sdp.prac2;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class SimpleFunctions {
    // public SimpleFunctions() {}

    public List<Integer> Task6(List<Integer> numbers) {
        List<Integer> roundedNumbers = new ArrayList<>();

        for (int num : numbers) {
            int roundedNum = roundUpToNearestMultipleOf100(num);
            roundedNumbers.add(roundedNum);
        }

        return roundedNumbers;
    }

    // Task2: Removes the first character from every element in a list.
    // If a list has no character remove it from the output.
    public List<String> Task2(List<String> inputList) {
        List<String> outputList = new ArrayList<>();
        for (String element : inputList) {
            if (element.length() > 0) { // checks if the element has characters
                // Removes the first character and adds it to the output list
                outputList.add(element.substring(1));
            }
        }
        return outputList;
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////
    // Task 3: returns true only if there are a matching number of brackets in a
    /////////////////////////////////////////////////////////////////////////////////////////////////////// string.
    public static boolean areParenthesesBalanced(String str) {
        Stack<Character> stack = new Stack<>(); // Stack to keep track of opening parentheses

        for (char ch : str.toCharArray()) { // Iterate through each character in the input string
            if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                if (stack.isEmpty()) {
                    return false;
                }
                stack.pop(); // Pop the stack as we have found a matching pair
            }
        }

        return stack.isEmpty();
    }
    /////////////////////////////////////////////////////////////////////////////////////////////////////////

    private int roundUpToNearestMultipleOf100(int num) {
        if (num % 100 == 0) {
            return num; // No rounding needed
        } else {
            return ((num / 100) + 1) * 100; // Round up to nearest multiple of 100
        }
    }

    public static boolean Task5(List<Integer> list) {
        // Check if the list is null or has one or fewer elements
        if (list == null || list.size() <= 1) {
            // A null list or a list with a single element is considered sorted
            return true;
        }

        // Iterate through the list starting from the second element
        for (int x = 1; x < list.size(); x++) {
            // Check if the current element is less than the previous element
            if (list.get(x) < list.get(x - 1)) {
                // If an element is out of order, return false
                return false;
            }
        }

        // If no elements are out of order, return true
        return true;
    }

}
