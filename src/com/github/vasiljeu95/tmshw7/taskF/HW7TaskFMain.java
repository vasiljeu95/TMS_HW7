package com.github.vasiljeu95.tmshw7.taskF;

public class HW7TaskFMain {
    public static void main(String[] args) {
        String[] arrayKeys = {"type", "color", "name"};
        int outputInt = 0;

        String[][] items = {{"phone","blue","pixel"},{"computer","silver","lenovo"},{"phone","gold","iphone"}};
        String ruleKey = "color";
        String ruleValue = "silver";

//        String[][] items = {{"phone","blue","pixel"},{"computer","silver","phone"},{"phone","gold","iphone"}};
//        String ruleKey = "type";
//        String ruleValue = "phone";

        for (int i = 0; i < arrayKeys.length; i++) {
            if (arrayKeys[i].equals(ruleKey)) {
                for (int j = 0; j < items.length; j++) {
                    if (items[j][i].equals(ruleValue)) {
                        outputInt++;
                    }
                }
            }
        }

        System.out.println(outputInt);
    }
}
