package com.github.vasiljeu95.tmshw7.taskF;

import java.util.Scanner;

public class HW7TaskFMain {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        String candiesText = sc.nextLine();

//        String[][] items = {{"phone","blue","pixel"},{"computer","silver","lenovo"},{"phone","gold","iphone"}};
//        String ruleKey = "color";
//        String ruleValue = "silver";

        String[][] items = {{"phone","blue","pixel"},{"computer","silver","phone"},{"phone","gold","iphone"}};
        String ruleKey = "type";
        String ruleValue = "phone";

        int ruleKeyInt = 0;
        int outputInt = 0;

        switch (ruleKey) {
            case "type":
                ruleKeyInt = 0;
                break;
            case "color":
                ruleKeyInt = 1;
                break;
            case "name":
                ruleKeyInt = 2;
                break;
            default:
                System.out.println("Неверные данные!!!");
        }

        for (int i = 0; i < items.length; i++) {
            if (items[i][ruleKeyInt].equals(ruleValue)) {
                outputInt++;
            }
        }

        System.out.println(outputInt);
    }
}
