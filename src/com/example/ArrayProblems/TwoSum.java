package src.com.example.ArrayProblems;

public class TwoSum {

    public static int[] sum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] nums = {10, 20, 30};
        int target = 50;
        int[] indices = sum(nums, target);

        if (indices.length == 2) {
            System.out.println("Indices of the two numbers whose sum is equal to the target:");
            System.out.println("Index 1: " + indices[0] + ", Index 2: " + indices[1]);
        } else {
            System.out.println("No two numbers found that sum up to the target.");
        }
    }
}
