package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MinimumDistances
{
    private static int minimumDistances(int[] numbers, int length)
    {
        List<Integer> list = new ArrayList<Integer>();
        int minDifference = 0, counter = 0;
        int diff;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (numbers[i] == numbers[j])
                {
//                    System.out.println(i + ", "+ j);
                    diff = Math.abs(i - j);
                    list.add(diff);
                    // System.out.println(diff);
                    // minDifference = Math.max(minDifference, diff);
                    minDifference = Collections.min(list);
                    // System.out.println(minDifference);
                    counter++;
                }
            }
        }
        if (counter == 0)
            return -1;
        else
            return minDifference;
    }

    public static void main(String[] args)
    {
        Scanner get = new Scanner(System.in);
        int size = get.nextInt();
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = get.nextInt();
        }
        System.out.println(minimumDistances(numbers, size));
    }


}
