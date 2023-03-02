package ru.netology;

public class Radio {
    private int currentRadioStation;
    private int currentVolume;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 10) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < 0) {
            return;
        }
        if (newCurrentRadioStation > 9) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    protected void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }

    protected void increaseRadioStation() {
        if (currentRadioStation < 9) {
            currentRadioStation = currentRadioStation + 1;
        } else {
            currentRadioStation = 0;
        }
    }

    protected void reduceVolume() {
        if (currentVolume <= 0) {
            currentVolume = 0;
        } else {
            currentVolume = currentVolume - 1;
        }
    }

    protected void reduceRadioStation() {
        if (currentRadioStation <= 0) {
            currentRadioStation = 9;
        } else {
            currentRadioStation = currentRadioStation - 1;

        }
    }

}
