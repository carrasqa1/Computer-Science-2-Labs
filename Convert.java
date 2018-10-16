import.java.util.Scanner;

public class Convert
{
   public static void main(String args[])
   {
      int remain;
      int i, seconds, minutes, hours;  
      Scanner kb = new Scanner(System.in);
      System.out.println("How many seconds? ");
      i = kb.nextInt();
      remain = i % 3,600;
      hours = i / 3,600;
      minutes = remain / 60;
      seconds = remain % 60;
      System.out.println(i + "seconds = " + hours + "hours," + minutes + "minutes," + seconds + "seconds");

    }
}  
     
