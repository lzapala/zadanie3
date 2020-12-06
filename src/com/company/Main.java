package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int t[] = {3, 5, 2};
        sortArrayWithoutCheating(t);
        System.out.println(Arrays.toString(t));
    }
    public static void sortArrayWithoutCheating(int[]t){
        for (int i = 0; i < t.length; i++)
        {
            for (int j = 0; j < i; j++)
            {
                if (t[i] < t[j])
                {
                    int temp = t[i];
                    t[i] = t[j];
                    t[j] = temp;
                }
            }
        }
    }
    public static void sortArray(int[]t){
        Arrays.sort(t);
    }
}
