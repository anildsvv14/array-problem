//Array Reverse in

//1. Array Reverse Using an Extra Array (Non In-place):
 class ReverseArrayExtraArray {
    /*public static void reverseArrayExtraArray(int[] arr) {
        int[] reversedArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversedArr[i] = arr[arr.length - i - 1];
        }
 
        // Print reversed array
        System.out.print("Reversed Array: ");
        for (int i : reversedArr) {
            System.out.print(i + " ");
        }
    }*/
    static void rvereseArray(int arr[], 
            int start, int end) 
        { 
         int temp; 

        while (start < end) 
        { 
            temp = arr[start]; 
            arr[start] = arr[end]; 
            arr[end] = temp; 
            start++; 
            end--; 
        } 
        }     

        /* Utility that prints out an 
        array on a line */
        static void printArray(int arr[], 
                    int size) 
        { 
        for (int i = 0; i < size; i++) 
        System.out.print(arr[i] + " "); 

        System.out.println(); 
        } 
}

public class Array2{
    public static void main(String[] args) {
        ReverseArrayExtraArray test1=new ReverseArrayExtraArray();
        //int[] originalArr = {1, 2, 3, 4, 5};
        //test1.reverseArrayExtraArray(originalArr);
        int arr[] = {1, 2, 3, 4, 5, 6}; 
        test1.printArray(arr, 6); 
        test1.rvereseArray(arr, 0, 5); 
        System.out.print("Reversed array is \n"); 
        test1.printArray(arr, 6); 
    }
}