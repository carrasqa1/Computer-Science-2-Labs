import java.util.*;

public class CS2ReviewB{
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter the size for an array");
        int size=kb.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter " + size + " numbers.");
        for(int i=0; i<arr.length; i++){
            arr[i] = kb.nextInt();
        }
        
        InputArray();
        SearchArray(arr);
        CountArray(arr);
        SumArray(arr);
        AvgArray(arr);
        MaxArray(arr);
        MinArray(arr);
    }  
    public static int[] InputArray(){
        Scanner input = new Scanner(System.in);
        System.out.println("What size do you want the array?");
        int size = input.nextInt();
        
        int array[] = new int[size];
        
        System.out.println("Enter " + size + " numbers.");
        for(int i=0; i<array.length; i++){
            array[i] = input.nextInt();
        }
        return array;
    }   
    public static boolean SearchArray(int []array){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to search for:");
        int key=input.nextInt();
        for(int i=0; i<array.length; i++){
            if(key == array[i]){
                System.out.println(key + " is in the array");
                return true;
            }
        }
        return false;
    }
    public static int CountArray(int[]array){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number you want to count in the array:");
        int num = input.nextInt();
        int count = 0;
        for(int i = 0; i<array.length; i++){
            if(num==array[i]){
                count++;
            }
        }
        System.out.println(num + " appears " + count + " times ");
        return count;
    }
    public static int SumArray(int[]array){
        int sum=0;
        for(int i: array){
            sum+=i;
        }
        System.out.println("The sum of all values in the array is " + sum);
        return sum;
    }
    public static int AvgArray(int[]array){
        int sum=0;
        int avg=0;
        for(int i: array){
            sum += i;
            avg = sum/array.length;
        }
        System.out.println("The average of the elements in the array is " + avg);
        return avg;
    }
    public static int MaxArray(int[] array){
        int max = array[0];
        for(int i=0; i<array.length; i++){
            if(array[i]>array[0]){
                max = array[i];
            }
        }
        System.out.println("the max is " + max);
        return max;
    }
    public static int MinArray(int[]array){
        int min = array[0];
        for(int j=0; j<array.length; j++){
            if(array[j]<array[0]){
                min = array[j];
            }
        }
        System.out.println("The min is " + min);
        return min; 
    }
}