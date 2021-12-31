package com.github.vasiljeu95.tmshw7.taskD;

import java.util.Scanner;

public class HW7TaskDMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String candiesText = sc.nextLine();
        String[] candiesArr = candiesText.split(" ");

        int[] candies = new int[candiesArr.length];
        int extraCandies = sc.nextInt();

        for (int i = 0; i < candies.length; i ++) {
            int numberOfCandies = Integer.parseInt(candiesArr[i]);

            if (1 <= numberOfCandies && numberOfCandies <= 100) {
                candies[i] = numberOfCandies;
            }
        }

        boolean[] booleanCandies = new boolean[candies.length];

        for (int i = 0; i < candies.length; i++) {
            for (int j = 0; j < candies.length; j ++) {
                if ((candies[i]+extraCandies) >= candies[j] && 1 <= extraCandies && extraCandies <= 50) {
                    booleanCandies[i] = true;
                } else {
                    booleanCandies[i] = false;
                    break;
                }
            }
        }

        for (int i = 0; i < booleanCandies.length; i++) {
            System.out.print(booleanCandies[i] + " ");
        }
    }
}
