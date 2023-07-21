package src.com.example.ArrayProblems;
import java.util.Arrays;

public class LargestValue {
    
    //Optimized Approach with O(N)
    public static int OptimizedApproach(int[]array){

        if(array==null){
            throw new IllegalArgumentException("Array is empty or null"); //check weather array is null

        } 
        int max = 0; //declare a max 
        for(int i=1;i<array.length;i++){
            if(array[i]>max){
                max = array[i];
            }
        }
        return max;

    }
    //Brute Force Approach with o(nlogn) as tc
    public static int FindLargest(int[]array){
        Arrays.sort(array);
        return array[array.length - 1]; 
    }
    public static void main(String[] args) {
       
    int [] array = {12,12,10,20,31,122,76,87,123,11};
    int largestValue = FindLargest(array);
    System.out.println("The largest value in the array is: " + largestValue);

    int largest = OptimizedApproach(array);
    System.out.println("The largest value in the array is: " + largest);
    }
    }

