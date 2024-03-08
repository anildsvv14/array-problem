//write a program to sort an given array
import java.util.Arrays;
public class Array5 {

        public static void main(String[] args){
            int [] arr = new int [] {5, 2, 8, 7, 1};
            int temp =0;
           // Arrays.sort(arr);
           System.out.println("Element of An Array");
            for(int a:arr){
                System.out.println(a);
            }
            for(int i=0;i<arr.length;i++){
                for(int j=i+1;j<arr.length;j++){
                    if(arr[i]>arr[j]){
                        temp = arr[i];    
                        arr[i] = arr[j];    
                        arr[j] = temp;    
                    }
                }
            }
            System.out.println("Sorted Array");
            for(int a:arr){
                System.out.println(a);
            }
        }
}