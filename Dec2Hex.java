import java.util.Scanner;
               // Java  updated  code
class Dec2Hex {

    public static void main(String args[]) {
        // Check if no input argument is provided
        if (chr.length == 0) {
            System.err.println("Error: No input provided. Please provide an integer input.");
            return;
        }

        try {
            int Arg1 = Integer.parseInt(args[0]);
            char ch[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
            int rem, num;
            num = Arg1;
            String hexadecimal = "";
            System.out.println("Converting the Decimal Value " + num + " to Hex...");

            while (num != 0) {
                rem = num % 16;
                hexadecimal = ch[rem] + hexadecimal;
                num = num / 16;
            }

            System.out.println("Hexadecimal representation is: " + hexadecimal);

        } catch (NumberFormatException e) {
            System.err.println("Error: The input provided is not a valid integer.");
        }
    }
}

