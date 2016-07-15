package com.epam.spb.lection2.HW3_160708;

public class FindJ {

    public  static void main (String[] args)
    {
        int n = 5;
        int[] arr = new int[] {1, 5, 4, 3, 2};
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        int sum_1 = 0;
        for (int i = 0; i <= n; i++) {
            sum_1 += i;
        }
        System.out.println("Результат: " + (sum_1 - sum));
    }
}
