package com.company;
import java.util.*;

// Question1:
//Given an array of integers,
// return the indices of the two numbers that add up to a given target.

//Example:
//If input array is [1, 3, 7, 9, 2] and the target is 11,
//Then there is one pair (9, 2) that on addition, will give the target i.e. 11.
//The output should be the pair of numbers giving the target.

//FAQ's:
//1. All numbers are positive.
//2. There are no duplicates.
//3. If there's no solution, return null.
//4. There is always a solution.
//5. Only 1 pair of numbers add up to the target.

public class ArrayQuestion1
{
    static List<Integer> twoSumSolution(List<Integer> numbers, int target)
    {
        for (int i = 0; i < numbers.size(); i++) {
            int numberToFind = target - numbers.get(i);
            for (int j = 0; j < numbers.size(); j++) {
                if(numberToFind == numbers.get(j))
                {
                    return Arrays.asList(i, j);
                }
            }
        }
        return null;
    }
    public static void main(String[] args)
    {
        Integer[] numbers = new Integer[] {1, 2, 3, 7, 9};
        // System.out.println(numbers[1]);
        int target = 11;
        List<Integer> nums = Arrays.asList(numbers);
        // System.out.println(twoSumSolution(nums, target));
    }
}
