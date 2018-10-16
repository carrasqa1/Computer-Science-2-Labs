
/**
 * Write a description of class MinuteConversion here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class MinuteConversion{
    public static void main(String[] args){
        //input scanner
        Scanner input = new Scanner(System.in);
        
        //ask user for input
        System.out.print("Enter the number of minutes: ");
        int minutes = input.nextInt();
        
        //calculate the number of years an days
        int years = minutes/525600;
        int days = (minutes%525600)/1440;
        
        //print
        System.out.println(minutes + " minutes is approximately "
                                   + years + " years and " + days
                                   + " days");
    }    
}
