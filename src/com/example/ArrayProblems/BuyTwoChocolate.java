package src.com.example.ArrayProblems;

import java.util.Arrays;
public class BuyTwoChocolate {

    class Solution {
        public int buyChoco(int[] prices, int money) {
            Arrays.sort(prices);
                  return prices[0] + prices[1] > money ? money : money - (prices[0] + prices[1]);    
        }
    }
    public static void main(String[] args) {
        int [] array = {10,10,20};
    Solution(array);
    System.out.println("Money Left is: " + Solution(array));
    }
    private static int Solution(int[] array) {
        return 0;
    }
}