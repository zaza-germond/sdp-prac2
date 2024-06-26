/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package sdp.prac2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class AppTest {

    ////////////////////////////////////////////////////////////////////////////////////////////
    // Test for task 4
    @Test
    public void testEqualSizeLists() {
        // Arrange
        List<Integer> list1 = List.of(1, 2, 3, 4);
        List<Integer> list2 = List.of(5, 6, 7, 8);

        // Act
        // List<Integer> result = ListMultiplier.multiplyLists(list1, list2);

        // Assert
        // assertNotNull(result);
        // assertEquals(List.of(8, 14, 18, 20), result);
    }

    @Test
    public void testDifferentSizeLists() {
        // Arrange
        List<Integer> list1 = List.of(1, 2, 3);
        List<Integer> list2 = List.of(4, 5, 6, 7);

        // Act
        // List<Integer> result = ListMultiplier.multiplyLists(list1, list2);

        // Assert
        // assertNull(result);
    }

    //////////////////////////////////////////////////////////////////////////////////////////////////
    @Test
    public void testTask6_emptyList() {
        // Create an instance of the class containing the method to be tested
        SimpleFunctions task6Test = new SimpleFunctions();

        // Define an empty input list
        List<Integer> input = Collections.emptyList();

        // Define the expected output as an empty list
        List<Integer> expectedOutput = Collections.emptyList();

        // Call the method being tested with the empty input list
        List<Integer> actualOutput = task6Test.Task6(input);

        // Assert that the actual output matches the expected output
        assertEquals(expectedOutput, actualOutput, "An empty list should return an empty list.");
    }

    @Test
    public void testTask6_needsRoundingUp() {
        // Create an instance of the class containing the method to be tested
        SimpleFunctions task6Test = new SimpleFunctions();

        // Define the input list of numbers that need rounding up
        List<Integer> input = Arrays.asList(101, 250, 399);

        // Define the expected output list after rounding
        List<Integer> expectedOutput = Arrays.asList(200, 300, 400);

        // Call the method being tested with the input list
        List<Integer> actualOutput = task6Test.Task6(input);

        // Assert that the actual output matches the expected output
        assertEquals(expectedOutput, actualOutput, "The numbers should be rounded up to the nearest multiple of 100.");
    }

    @Test
    public void testTask3_balancedAndNestedCorrectly() {
        //Arrange
        //Creates an instance of the class which contains the method to test
        SimpleFunctions task3Test = new SimpleFunctions();
        //define the input as some string that containes balanced and nested brackets
        String input = "(a(b)c)";
        //Act
        //Get the result of running the input through the method
        boolean result = task3Test.areParenthesesBalanced(input);
        //Assert
        //Checks that the result is indeed true. If it fails the test then the message will be displayed
        assertTrue(result, "The string has balanced and correctly nested brackets.");
    }

    @Test
    public void testTask3_unbalancedBrackets() {
        //Arrange
        //Creates an instance of the class which contains the method to test
        SimpleFunctions task3Test = new SimpleFunctions();
        //define the input as some string that containes unbalanced brackets
        String input = "(a(b)c";
        //Act
        //Get the result of running the input through the method
        boolean result = task3Test.areParenthesesBalanced(input);
        //Assert
        //Checks that the result is indeed false. If it fails the test then the message will be displayed
        assertFalse(result, "The string has unbalanced brackets.");
    }

}
