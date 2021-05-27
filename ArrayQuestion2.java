package com.company;

//Question 2:
//Problem statement:
//You are given an array of positive integers where each integer represents the height of a vertical line on a chart.
//Find two lines which together with the x-axis forms a container that would hold the greatest amount of water.
//return the area of water it would hold.

//Example:
//Suppose the array is [1, 8, 6, 2, 9, 4].
//The highest 2 numbers of the array are 8 and 9. They will act as the walls of the container.
//The length will be the smallest amongst the walls (in this case, it'll be 8).
//The width will be the distance between the walls (in this case, it'll be 3).


public class ArrayQuestion2
{
    static int withMostWater(Integer[] height)
    {
        int p1 = 0, p2 = height.length - 1, maxArea = 0;

        while (p1 < p2)
        {
            int heights = Math.min(height[p1], height[p2]);
            int width = p2 - p1;
            int area = heights * width;
            maxArea = Math.max(maxArea, area);

            if (height[p1] <= height[p2])
                p1++;
            else
                p2--;
        }
        return maxArea;
    }

    public static void main(String[] args)
    {
        Integer[] heights = new Integer[] {4, 8, 1, 2, 3, 9};
        int result = withMostWater(heights);
        System.out.println(result);
    }
}
