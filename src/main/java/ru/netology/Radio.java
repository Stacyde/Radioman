package ru.netology;

public class Radio {
    private int maxVolume = 100;
    private int minVolume = 0;
    private int numberVolume = 101;
    private int currentVolume = minVolume;
    private int maxRadioStation = 9;
    private int minRadioStation = 0;
    private int numberRadioStation = 10;
    private int currentRadioStation = minRadioStation;

    public Radio(){
    }
    public Radio(int numberRadioStation){
        this.numberRadioStation = numberRadioStation;
        this.maxRadioStation = numberRadioStation -1;
    }


    public int getCurrentVolume() {
        return currentVolume;
    } //+

    public int getCurrentRadioStation() {
        return currentRadioStation;
    } //+

    public int getMaxVolume() { 
        return maxVolume;
    }
    public void setMaxVolume(int newMaxVolume){ 
        if (newMaxVolume > maxVolume) {
            return;
        }
        this.maxVolume = maxVolume;
    }

    public int getMinVolume() {  
        return minVolume;
    }
    public void setMinVolume(int newMinVolume) {  
        if (newMinVolume < minVolume) {
            return;
        }
        this.minVolume = minVolume;
    }

    public int getNumberVolume() { 
        return numberVolume;
    }

    public int getMaxRadioStation() { 
        return maxRadioStation;
    }

    public void setMaxRadioStation(int newMaxRadioStation) { 
        if (newMaxRadioStation > maxRadioStation) {
            return;
        }
        this.maxRadioStation = maxRadioStation;
    }

    public int getMinRadioStation() { 
        return minRadioStation;
    }

    public void setMinRadioStation(int newMinRadioStation) { 
        if (newMinRadioStation > minRadioStation) {
            return;
        }
        this.minRadioStation = minRadioStation;
    }

    public int getNumberRadioStation() {    
        return numberRadioStation;
    }

    public void setCurrentVolume(int newCurrentVolume) { 
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume >= maxVolume) {
        }
        if(newCurrentVolume >= numberVolume){
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) { 
        if (newCurrentRadioStation < 0) {
            return;
        }
        if (newCurrentRadioStation > maxRadioStation) {
        }
        if(newCurrentRadioStation >= numberRadioStation){
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }
    public void setNumberRadioStation(int newNumberRadioStation){ 
        if (newNumberRadioStation < 0) {
            return;
        }
        if (newNumberRadioStation > numberRadioStation) {
        }
        if (newNumberRadioStation >= numberRadioStation) {
            return;
        }
        numberRadioStation = newNumberRadioStation;
    }
    public void setNumberVolume(int newNumberVolume){ 
        if (newNumberVolume < 0) {
            return;
        }
        if (newNumberVolume > numberVolume) {
        }
        if (newNumberVolume >= numberVolume) {
            return;
        }
        numberVolume = newNumberVolume;
    }

    protected void increaseVolume() { 
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = 100;
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
            currentRadioStation = 10;
        } else {
            currentRadioStation = currentRadioStation - 1;

        }
    }
    public void reduceNumberRadioStation() { 
        if ( numberRadioStation > minRadioStation) {
            numberRadioStation = numberRadioStation - 1;
        } else {
            numberRadioStation = 0;
        }
    }
    public void increaseNumberRadioStation() { 
        if (numberRadioStation >= minRadioStation) {
            numberRadioStation = numberRadioStation + 1;
        }
        if (numberRadioStation > maxRadioStation) {
            numberRadioStation = maxRadioStation;
        }

    }
}
