import java.util.Scanner;

public class Sorting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Prompts user to enter a list
        System.out.print("Enter list size: ");
        int size = input.nextInt();
        System.out.print("Enter " + size + " numbers into list: ");
        int[] list = new int[size];
        for (int i = 0; i < list.length; i++){
            list[i] = input.nextInt();
        }
        // Displays whether the list is sorted or not.
        if(isSorted(list)){
            System.out.println("The list is already sorted");
        }else{
            System.out.println("The list is not sorted");
        }
    }

    /*method that returns true if alread sorted in 
     *increasing order, else false
     */
    public static boolean isSorted(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            if (list[i] > list[i + 1]){
                return false;
            }
        }
        return true;
    }
}