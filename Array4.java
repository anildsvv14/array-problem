//Array Reverse Recursion
public class Array4{

    static void rvereseArray(int arr[], int start, int end) 
    { 
        int temp; 
        if (start >= end) 
            return; 
        temp = arr[start]; 
        arr[start] = arr[end]; 
        arr[end] = temp; 
        rvereseArray(arr, start+1, end-1); 
    } 
    /* Utility that prints out an array on a line */
    static void printArray(int arr[]) 
    { 
        for(int a:arr){
            System.out.println(a);
        }
    } 
    public static void main(String [] args){
        int arr[] = {1, 2, 3, 4, 5, 6}; 
        printArray(arr); 
        rvereseArray(arr, 0, 5); 
        System.out.println("Reversed array is "); 
        printArray(arr); 
    }
}