import java.util.*;
public class ImproperFractions {
    public static void main(String args[]) {
        // asking input from user
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a numerator: ");
        int numerator = input.nextInt();
        System.out.println("Enter a denominator: ");
        int denominator = input.nextInt();

        // checking the condition using if loop
        if (numerator < denominator) {
            // displaying output
            System.out.println(numerator + " / " + denominator + " is a proper fraction");
        }else if( numerator % denominator == 0 ) {
            // displaying output
            System.out.print(numerator + " / " + denominator + " is an improper fraction ");
            System.out.println("it can be reduced to " + numerator/denominator);
        }else {
            // displaying output
            System.out.print(numerator + " / " + denominator + " is an improper fraction ");
            System.out.print("and its mixed fraction is " + numerator/denominator + " + " + numerator % denominator + " / " + denominator);
        }
    }
}