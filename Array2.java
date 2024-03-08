//Array Reverse in

//1. Array Reverse Using an Extra Array (Non In-place):
 class ReverseArrayExtraArray {
    public static void reverseArrayExtraArray(int[] arr) {
        int[] reversedArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversedArr[i] = arr[arr.length - i - 1];
        }
 
        // Print reversed array
        System.out.print("Reversed Array: ");
        for (int i : reversedArr) {
            System.out.print(i + " ");
        }
    }
}

public class Array2{
    public static void main(String[] args) {
        ReverseArrayExtraArray test1=new ReverseArrayExtraArray();
        int[] originalArr = {1, 2, 3, 4, 5};
        test1.reverseArrayExtraArray(originalArr);
    }
}