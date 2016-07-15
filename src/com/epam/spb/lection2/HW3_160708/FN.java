package com.epam.spb.lection2.HW3_160708;

public class FN {

    public static void main(String[] args) {

        int n = 4;
        int result = 1;
        int dop = 1;
        for (int i = 0; i < n; i++){
            dop *= (i+1);
            result *= dop;
        }
        System.out.println(result);




    }
}
