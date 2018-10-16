import java.util.*;
public class Lab6A{
    public static int productOfOdds(int[] list, int a){
        if(a == 1){
            if((list[a-1] % 2) != 0){
                return list[a-1];
            }else{
                return 1;
            }
        }else if((list[a-1] % 2) != 0){
            return (list[a-1] * productOfOdds(list, a-1));
        }else{
            return productOfOdds(list, a-1);
        }
    }
    
    public static void main(String[] args){
        int [] arr = {3,1,2,4,6,8,10,11};
        System.out.print(productOfOdds(arr, arr.length));
    }
}