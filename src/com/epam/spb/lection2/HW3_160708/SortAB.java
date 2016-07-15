package com.epam.spb.lection2.HW3_160708;

public class SortAB {

    public static void main(String[] args) {

        int[] A = {1,3,5,7,9};
        int[] B = {2,4,6,8,10};

        for (int i = 0; i < 5; i++){
            if(A[i] > B[i]){
                System.out.print(B[i] + ",");
                System.out.print(A[i] + ",");
            }
            else {
                System.out.print(A[i] + ",");
                System.out.print(B[i] + ",");
            }
        }
    }

}
