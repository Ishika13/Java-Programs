package com.company;

import java.util.List;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class EqualizeTheArray
{
    private static int solution (int[] arr)
    {
        // Finding out the most occurring element.
        Arrays.sort(arr);
        int maxFreq = 0, ans = -1, i = 0, max = 0, counter = 0;
        while (i < arr.length)
        {
            int currFreq = 1;
            while (i + 1 < arr.length && arr[i + 1] == arr[i])
            {
                currFreq = currFreq + 1;
                i = i + 1;
            }
            if (maxFreq < currFreq)
            {
                maxFreq = currFreq;
                max = arr[i];
            }
            else if (maxFreq == currFreq)
                max = Math.min(max, arr[i]);
            i++;
        }

        // Checking if the elements are equal to most occurring element.
        for (int j = 0; j < arr.length; j++)
        {
            if (max != arr[j])
                counter++;
        }
        return counter;
    }

    public static void main(String[] args)
    {
        Scanner get = new Scanner(System.in);
        int n = get.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
        {
            arr[i] = get.nextInt();
        }
        // System.out.println(arr);
        int result = solution(arr);
        System.out.println(result);
    }
}
