package exercises;

import java.util.Scanner;


public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello, what is the length of rectangle? ");
        Double rectangleLength = input.nextDouble();
        System.out.println("What is the width of rectangle? ");
        Double rectangleWidth = input.nextDouble();

        System.out.println("The area of the rectangle is " + rectangleWidth * rectangleLength);


    }
}
