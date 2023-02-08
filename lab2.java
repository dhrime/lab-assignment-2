import java.util.Scanner;
import java.util.random.*;

public class lab2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int arraySize = 0;
        int[] array = null;
 
        // Take user input for array size

        boolean inputIsValid = false;
        while (!inputIsValid)
        {
            System.out.print("Please enter array size: ");
            
            if (input.hasNextInt()) 
            {
                arraySize = input.nextInt();
                if (arraySize > 0)
                {
                    inputIsValid = true;
                    array = createArray(arraySize);
                    System.out.println("\nYour array has been created.\n");
                }
                else
                {
                    System.out.println("Incorrect input! Please enter a positive integer.\n");
                }
            }
            else 
            {
                System.out.println("Incorrect input! Please enter a positive integer.\n");
                input.next();
            }
        }


        // Display menu options and take user input

        boolean programActive = true;

        while(programActive)
        {
            System.out.println("Please choose an action:\n" +
                            "1) Find the maximum of the array\n" +
                            "2) Find the minimum of the array\n" +
                            "3) Find the average of the array and display how each element differs from the average\n" +
                            "4) Find the sum of the elements with an odd index\n" +
                            "5) Find the sum of the elements with an even index\n" +
                            " Press \"q\" to quit the program. ");
            
            char userChoice = input.next().charAt(0);

            // Find max value
            if (userChoice == '1')
            {
                int maxValue = arrayMax(array);
                System.out.println("The maximum value of the array is: " + maxValue);
            }
            
            // Find min value
            else if (userChoice == '2')
            {
                int minValue = arrayMin(array);
                System.out.println("The minimum value of the array is: " + minValue);
            }

            // Find average and display differences
            else if (userChoice == '3')
            {
                arrayAverage(array);
            }

            // Find sum of odd index elements
            else if (userChoice == '4')
            {
                int oddSum = arrayOddIndexSum(array);
                System.out.println("The sum of elements with an odd index is: " + oddSum);
            }

            // Find sum of even index elements
            else if (userChoice == '5')
            {
                int evenSum = arrayEvenIndexSum(array);
                System.out.println("The sum of the elements with an even index is: " + evenSum);
            }

            // Quit the program
            else if (userChoice == 'q')
            {
                System.out.println("Goodbye!");
                programActive = false;
            }

        }

        

    }


    // TODO
    // method to create an array of random integers [0, 100] with given the size
    public static int[] createArray(int arraySize) {


    }

    // TODO
    // method to find max value of array
    public static int arrayMax(int[] array) {


    }

    // TODO
    // method to find min value of array
    public static int arrayMin(int[] array) {

        
    }

    // TODO
    // method to find the average of array and display the differences from the average
    public static void arrayAverage(int[] array) {


    }

    // TODO
    // method to find sum of odd indexes
    public static int arrayOddIndexSum(int[] array) {


    }

    // TODO
    // method to find sum of even indexes
    public static int arrayEvenIndexSum(int[] array) {


    }


}
