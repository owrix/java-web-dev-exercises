package exercises;
import java.util.Scanner;

public class MPG {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to MPG calculator. How many miles have you driven? ");
        Double miles = input.nextDouble();
        System.out.println("How many gallons of gas have you used? ");
        Double gallonsOfGas = input.nextDouble();

        System.out.println("The MPG for your trip is " + miles / gallonsOfGas);
    }
}
