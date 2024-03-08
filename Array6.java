//Number of occurrence of a given element
public class Array6 {
    
    static int countNumberOfOccourences(int arr[], int x){
        int count =0;
            for(int a : arr){
                if(a==x){
                    count++;
                }
            }
        return count;
    }
    public static void main(String[] args){
        int arr[] = {1, 2, 2, 2, 2, 3, 4, 7 ,8 ,8 ,2};
        int x = 2;
        System.out.println(countNumberOfOccourences(arr, x));
    }
}
