// Importing the JUnit framework classes for writing test cases
import org.junit.Test;
import static org.junit.Assert.*;

// Declaring the Dec2HexTest class to contain test methods for the Dec2Hex program
public class Dec2HexTest {

    // Test method to check the program's response to null input
    @Test
    public void testNullInput() {
        // Creating an empty String array to simulate no input argument scenario
        String[] args = {};

        // Trying to run the main method of Dec2Hex with empty arguments
        try {
            Dec2Hex.main(args);
            // If no exception is thrown, force the test to fail as it's an unexpected behavior
            fail("Expected an exception for null input");
        } catch (ArrayIndexOutOfBoundsException e) {
            // Checking if the correct exception is thrown with the expected message
            assertEquals("No input argument provided.", e.getMessage());
        }
    }

    // Test method to check the program's response to non-numeric input
    @Test
    public void testNonNumericInput() {
        // Creating a String array with a non-numeric input to simulate this scenario
        String[] args = {"abc"};

        // Trying to run the main method of Dec2Hex with a non-numeric argument
        try {
            Dec2Hex.main(args);
            // If no exception is thrown, force the test to fail as it's an unexpected behavior
            fail("Expected an exception for non-numeric input");
        } catch (NumberFormatException e) {
            // Checking if the correct exception is thrown with the expected message
            assertEquals("For input string: \"abc\"", e.getMessage());
        }
    }
}
