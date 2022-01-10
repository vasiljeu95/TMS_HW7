package com.github.vasiljeu95.tmshw7.taskG;

import java.util.Scanner;

public class HW7TaskGMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        int k = sc.nextInt();

        String[] textArray = text.split(" ");

        if (k < textArray.length) {
            for (int i = 0; i < k; i++) {
                System.out.print(textArray[i] + " ");
            }
        } else {
            System.out.println("incorrect data");
        }
    }
}
