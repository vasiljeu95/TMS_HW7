package com.github.vasiljeu95.tmshw7.taskC;

import java.util.Arrays;

public class HW7TaskCMain {
    public static void main(String[] args) {
        //int[][] accounts = {{1,5},{7,3},{3,5}};
        //int[][] accounts = {{1,2,3}, {3,2,1}};
        int[][] accounts = {{2,8,7},{7,1,3},{1,9,5}};

        int[] summaOfMoney = new int[accounts.length];

        for (int i = 0; i < accounts.length; i++) {
            int summaOfMoneyInArray = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                summaOfMoneyInArray += accounts[i][j];
            }
            summaOfMoney[i] = summaOfMoneyInArray;
        }

        Arrays.sort(summaOfMoney);
        System.out.println(summaOfMoney[summaOfMoney.length-1]);
    }
}
