package com.github.vasiljeu95.tmshw7.taskA;

import java.util.Scanner;

public class HW7TaskAMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String textNums = sc.nextLine();
        String[] textNumsArray = textNums.split(" ");

        int[] nums = new int [textNumsArray.length];

        for (int i = 0; i < textNumsArray.length; i++) {
            nums[i] = Integer.parseInt(textNumsArray[i]);
        }

        int[] ans = new int [nums.length];

        for (int i = 0; i < ans.length; i++) {
            if (nums[i] < ans.length) {
                ans[i] = nums[nums[i]];
            }
        }

        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
