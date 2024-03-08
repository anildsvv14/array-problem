//Move all negative numbers to beginning and positive to end with constant extra space

import java.util.Arrays;

public class Array7 {
    
    public static void move(int[] arr) 
    { 
        Arrays.sort(arr); 
    } 
    
    public static void main(String []args){
        int[] arr = { -1, 2, -3, 4, 5, 6, -7, 8, 9 }; 
        move(arr); 
        for (int e : arr) 
            System.out.print(e + " "); 
    }
}
