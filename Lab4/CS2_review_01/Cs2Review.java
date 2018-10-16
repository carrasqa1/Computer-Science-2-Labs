import java.util.*;
public class Cs2Review{
    static int N;
    
    public static void standardI(int N){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a positive integer:");
        N = input.nextInt();
    }
    public static void standardO(int N){
        System.out.println("The number entered is: " + N);
    }
    public static int ifMethod(int N){
       if(N > 1000){
           System.out.println("Enter a smaller number");
       }else{
           System.out.println("Good Choice");
       }
       return N;
    }
    public static int ifElseMethod(int N){
       if(N>0){
           System.out.println(N + " is a positive number");
       }else if(N == 0){
           System.out.println("0 is neither even nor odd");
       }else{
           System.out.println(N + " is a negative number");
       }
       return N;
    }
    public static int nestedMethod(int N){
        if(N>40){
            if(N<50){
                System.out.println("Your grade is an F");
            }else if(N>50 && N<60){
                System.out.println("Your grade is a D");
            }else if(N>60 && N<70){
                System.out.println("Your grade is a C");
            }else if(N>70 && N<80){
                System.out.println("Your grade is a B");
            }else{
                System.out.println("Your grade is an A");
            }
        } 
        return N;
    }
    public static int switchMethod(int N){
        switch(N){
            case 0: System.out.println("The color is blue");break;
            case 1: System.out.println("The color is red"); break;
            case 2: System.out.println("The color is orange"); break;
            case 3: System.out.println("The color is purple"); break;
            case 4: System.out.println("The coloe is pink"); break;
        }
        return N;
    }
    public static int whileMethod(int N){
        int count = 1;
        while(count < N){
            System.out.println("Count: " + count);
            count++;
        }
        return N;
    }
    public static int doMethod(int N){
        do{
            System.out.println(N + " is under 10");
            N++;
        }while(N < 10);
        return N;
    }
    public static int forMethod(int N){
        for(int i=N; i>1; i--){
            System.out.println("The value of N is: " + N);
        }
        return N;
    }
    public static void main(String[] args){
        standardI(N);
        standardO(N);
        ifMethod(N);
        ifElseMethod(N);
        nestedMethod(N);
        switchMethod(N);
        whileMethod(N);
        doMethod(N);
        forMethod(N);
    }
}