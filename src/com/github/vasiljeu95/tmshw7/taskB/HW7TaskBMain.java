package com.github.vasiljeu95.tmshw7.taskB;

import java.util.Scanner;

public class HW7TaskBMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String textNumbers = sc.nextLine();
        String[] textNumbersArray = textNumbers.split(" ");

        int[] nums = new int [textNumbersArray.length];

        for (int i = 0; i < textNumbersArray.length; i++) {
            nums[i] = Integer.parseInt(textNumbersArray[i]);
        }

        int n = nums.length;
        int[] ans = new int [n * 2];

        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];
            ans[(i + n)] = nums[i];
        }

        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
