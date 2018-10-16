import java.util.*;
public class Cs2Review{
    static int N;
    
    public static int standardI(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a positive integer:");
        N = input.nextInt();
        return N;
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
    public static void nestedMethod(int N){
        if(N>40){
            if(N<50 && N>40){
                System.out.println("Your grade is an F");
            }else if(N>50 && N<60){
                System.out.println("Your grade is a D");
            }else if(N>60 && N<70){
                System.out.println("Your grade is a C");
            }else if(N>70 && N<80){
                System.out.println("Your grade is a B");
            }else if (N>80 && N<=100){
                System.out.println("Your grade is an A");
            }
        } 
        if(N<=40){
            System.out.println("Too low of a score");
        }
        //return N;
    }
    public static int switchMethod(int N){
        switch(N){
            case 40: System.out.println("The color is blue");break;
            case 30: System.out.println("The color is red"); break;
            case 20: System.out.println("The color is orange"); break;
            case 10: System.out.println("The color is purple"); break;
            case 0: System.out.println("The coloe is pink"); break;
        }
        return N;
    }
    public static void whileMethod(int N){
        int i = 1;
        System.out.println("Result of the whileMethod is: ");
        while(i <= N){
            if(i%2==0){
                System.out.print(i + ", ");
            }
            i++;
        }
        System.out.println("");
    }
    public static void doMethod(int N){
        //works when N is greater than 10
        System.out.println("Result of doMethod: ");
        do{
            System.out.print(N + ", ");
            N--;
        }while(N>10);
        System.out.println("");
    }
    static int total = 1;
    public static void forMethod(int N){
        for(int i=1; i<=N; i++){
            total = total * i;
        }
        System.out.println("The total is: " + total);
    }
    public static void main(String[] args){
        standardI();
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