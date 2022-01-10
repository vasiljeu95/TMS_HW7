package com.github.vasiljeu95.tmshw7.taskE;

public class HW7TaskEMain {
    public static void main(String[] args) {
        int[] encoded = {1,2,3};
        int first = 1;
        int[] arr = new int[encoded.length+1];

        // encoded[i] = arr[i] ^ arr[i + 1];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (encoded[i] ^ encoded[i+1]);
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
