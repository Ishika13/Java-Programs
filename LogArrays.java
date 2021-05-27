package com.company;
// Log all pairs of an array:
public class LogArrays
{
    public static void logArray(int[] boxes)
    {
        for (int i = 0; i < boxes.length; i++) {
            for (int j = i+1; j < boxes.length; j++) {
                System.out.println("(" + boxes[i] + ", " +boxes[j] + ")");
            }
        }
    }
    public static void main(String[] args)
    {
        int[] boxes = new int[] {1, 2, 3, 4, 5};

        logArray(boxes);
    }
}