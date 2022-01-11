package com.github.vasiljeu95.tmshw7.taskH;

public class ParkingSystem {
    int[] parkingPlace = new int[3];

    public ParkingSystem(int big, int medium, int small) {
        parkingPlace[0] = big;
        parkingPlace[1] = medium;
        parkingPlace[2] = small;
    }

    public boolean addCar(int carType) {
        if (parkingPlace[carType - 1] > 0) {
            parkingPlace[carType-1]--;
            return true;
        } else {
            return false;
        }
    }
}
