// Create a method called average that calculates the average of the numbers passed as parameters.
// The previously created method sum must be used inside this method!

public class Averaging {

    // implement the sum method here again
    public static int sum(int number1, int number2, int number3, int number4) {
        int sumNumber = number1 + number2 + number3 + number4;
        return sumNumber;
    }

    public static double average(int number1, int number2, int number3, int number4) {
        int sumNumber = number1 + number2 + number3 + number4;
        double average = (double) sumNumber / 4.0;
        return average;
    }

    public static void main(String[] args) {
        double result = average(4, 3, 6, 1);
        System.out.println("Average: " + result);
    }
}
