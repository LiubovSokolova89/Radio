package ru.netology.radio;

public class Radio {
    private int maxStation = 9;
    private int minStation = 0;
    private int maxVolume = 100;
    private int minVolume = 0;


    private int currentStation = minStation;
    private int volume = minVolume;

    public Radio(int maxStation) {

        this.maxStation = maxStation;

    }

    public Radio() {
    }


    public int getCurrentStation() {
        return currentStation;
    }

    public int getMaxStation() {
        return maxStation - 1;
    }

    public int getMinStation() {
        return minStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < minStation) {
            return;
        }
        if (newCurrentStation > maxStation - 1) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void setToMinStation() {
        currentStation = minStation;
    }


    public void changeOnPreviousRadioStation() {
        if (currentStation <= minStation) {
            currentStation = maxStation - 1;
        }
    }

    public void changeOnNextRadioStation() {
        if (currentStation == maxStation - 1) {
            currentStation = minStation;
        }
    }

    public void increaseRadioStation() {
        if (currentStation < maxStation - 1) {
            currentStation = currentStation + 1;
        }
    }

    public void setToMaxStation() {
        currentStation = maxStation - 1;
    }

    public void decreaseRadioStation() {
        if (currentStation > minStation) {
            currentStation = currentStation - 1;
        }
    }

    public int getVolume() {
        return volume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setVolume(int newVolume) {
        if (newVolume < minVolume) {
            return;
        }
        if (newVolume > maxVolume - 1) {
            return;
        }
        volume = newVolume;
    }

    public void setToMaxVolume() {
        volume = maxVolume;
    }

    public void increaseVolume() {
        if (volume < maxVolume - 1) {
            volume = volume + 1;
        }
    }

    public void setToMinVolume() {
        volume = minVolume;
    }

    public void decreaseVolume() {
        if (volume > minVolume) {
            volume = volume - 1;
        }
    }
}
