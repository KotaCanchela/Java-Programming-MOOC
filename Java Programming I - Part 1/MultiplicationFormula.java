import java.util.Scanner;

public class MultiplicationFormula {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give the first number:");
        int firstValue = Integer.valueOf(scan.nextLine());

        System.out.println("Give the second number:");
        int secondValue = Integer.valueOf(scan.nextLine());

        System.out.println(
                String.valueOf(firstValue) + " * " + String.valueOf(secondValue) + " = " + (firstValue * secondValue));
    }
}