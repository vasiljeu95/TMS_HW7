package com.github.vasiljeu95.tmshw7.taskH;

import java.util.Scanner;

public class HW7TaskHMain {
    public static void main(String[] args) {
        // Input for checking:
        // 1, 1, 0
        // 1, 2, 3, 1

        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String numText = sc.nextLine();

        int[] parkingArray = HW7TaskHMain.textSetInIntArray(text);
        int[] carsArray = HW7TaskHMain.textSetInIntArray(numText);

        ParkingSystem parking = new ParkingSystem(parkingArray[0], parkingArray[1], parkingArray[2]);
        boolean[] boolArray = new boolean[carsArray.length];

        for (int i = 0; i < boolArray.length; i++) {
            boolArray[i] = parking.addCar(carsArray[i]);
        }

        for (int i = 0; i < boolArray.length; i++) {
            System.out.print(boolArray[i] + " ");
        }
    }

    static int[] textSetInIntArray (String text) {
        String[] stringArray = text.split(", ");
        int[] intArray = new int[stringArray.length];
        for (int i = 0; i < stringArray.length; i++) {
            intArray[i] = Integer.parseInt(stringArray[i]);
        }

        return intArray;
    }
}
