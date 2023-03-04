package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.Radio;

public class RadioTest {
    @ParameterizedTest //+
    @CsvSource({
            "0,0",
            "0,-1",
            "25,25",
            "50,50",
            "75,75",
            "100,100",
            "0,101"
    })
    public void volume(int expected, int newCurrentVolume) {
        Radio cond = new Radio();
        cond.setCurrentVolume(newCurrentVolume);

        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @ParameterizedTest //+
    @CsvSource({
            "0,-1",
            "0,0",
            "5,5",
            "9,9",
            "0,10"
    })
    public void station(int expected, int newCurrentRadioStation) {
        Radio cond = new Radio();
        cond.setCurrentRadioStation(newCurrentRadioStation);

        int actual = cond.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }
    @ParameterizedTest //+
    @CsvSource({
            "1,0",
            "26,25",
            "51,50",
            "76,75",
            "100,100"
    })
    public void increaseVolume(int expected, int newCurrentVolume) {
        Radio cond = new Radio();
        cond.setCurrentVolume(newCurrentVolume);
        cond.increaseVolume();

        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "1,0",
            "6,5",
            "9,8",
            "0,9"
    })
    public void radioStationIncrease(int expected, int newCurrentStation) {
        Radio cond = new Radio();
        cond.setCurrentRadioStation(newCurrentStation);
        cond.increaseRadioStation();

        int actual = cond.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest  //+
    @CsvSource({
            "0,0",
            "24,25",
            "49,50",
            "74,75",
            "99,100"
    })
    public void reduceVolume(int expected, int newCurrentVolume) {
        Radio cond = new Radio();
        cond.setCurrentVolume(newCurrentVolume);
        cond.reduceVolume();

        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @ParameterizedTest //+
    @CsvSource({
            "10,0",
            "4,5",
            "8,9"
    })
    public void radioStationReduce(int expected, int newCurrentStation) {
        Radio cond = new Radio();
        cond.setCurrentRadioStation(newCurrentStation);
        cond.reduceRadioStation();

        int actual = cond.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }
    @ParameterizedTest
    @CsvSource({
            "100,-1",
            "100,0",
            "100,25",
            "100,50",
            "100,75",
            "100,100",
            "100,101"

    })
    public void maxVolume(int expected,int newMaxVolume){
        Radio cond = new Radio();
        cond.setMaxVolume(newMaxVolume);

        int actual = cond.getMaxVolume();

        Assertions.assertEquals(expected, actual);
    }
    @ParameterizedTest
    @CsvSource({
            "0,-1",
            "0,0",
            "0,25",
            "0,50",
            "0,75",
            "0,100",
            "0,101"

    })
    public void minVolume(int expected,int newMinVolume){
        Radio cond = new Radio();
        cond.setMinVolume(newMinVolume);

        int actual = cond.getMinVolume();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "9,-1",
            "9,0",
            "9,5",
            "9,9",
            "9,10"
    })
    public void maxRadioStation(int expected,int newMaxRadioStation){
        Radio cond = new Radio();
        cond.setMaxRadioStation(newMaxRadioStation);

        int actual = cond.getMaxRadioStation();

        Assertions.assertEquals(expected, actual);
    }
    @ParameterizedTest
    @CsvSource({
            "0,-1",
            "0,0",
            "0,5",
            "0,9",
            "0,10"
    })
    public void minRadioStation(int expected,int newMinRadioStation){
        Radio cond = new Radio();
        cond.setMinRadioStation(newMinRadioStation);

        int actual = cond.getMinRadioStation();

        Assertions.assertEquals(expected, actual);
    }
    @ParameterizedTest
    @CsvSource({
            "10,-1",
            "0,0",
            "5,5",
            "9,9",
            "10,10",
            "10,11"
    })
    public void numberRadioStation(int expected,int newNumberRadioStation){
        Radio cond = new Radio();
        cond.setNumberRadioStation(newNumberRadioStation);

        int actual = cond.getNumberRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "101,-1",
            "0,0",
            "50,50",
            "75,75",
            "101,101",
            "101,102"
    })
    public void numberVolume(int expected,int newNumberVolume){
        Radio cond = new Radio();
        cond.setNumberVolume(newNumberVolume);

        int actual = cond.getNumberVolume();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "0,0",
            "4,5",
            "8,9",
            "9,10"
    })
    public void numberRadioStationReduce(int expected,int newNumberStation){
        Radio cond = new Radio();
        cond.setNumberRadioStation(newNumberStation);
        cond.reduceNumberRadioStation();

        int actual = cond.getNumberRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "1,0",
            "6,5",
            "9,9"
    })
    public void numberRadioStationIncrease(int expected,int newCurrentStation){
        Radio cond = new Radio();
        cond.setNumberRadioStation(newCurrentStation);
        cond.increaseNumberRadioStation();

        int actual = cond.getNumberRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "10,10",
            "25,25",
            "50,50",
            "75,75",
            "100,100"
    })
    public void RadioStationNumber(int expected,int numberRadioStation){
        Radio cond = new Radio(numberRadioStation);
        cond.setNumberRadioStation(numberRadioStation);

        int actual = cond.getNumberRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "9,10",
            "24,25",
            "49,50",
            "74,75",
            "99,100"
    })
    public void RadioStationNumberMax(int expected,int numberRadioStation){
        Radio cond = new Radio(numberRadioStation);
        cond.setNumberRadioStation(numberRadioStation);
        cond.getMaxRadioStation();

        int actual = cond.getMaxRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "0,0",
            "0,10",
            "0,25",
            "0,50",
            "0,75",
            "0,100"
    })
    public void RadioStationNumberMin(int expected,int numberRadioStation){
        Radio cond = new Radio(numberRadioStation);
        cond.setNumberRadioStation(numberRadioStation);
        cond.getMinRadioStation();

        int actual = cond.getMinRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "0,0",
            "9,10",
            "24,25",
            "49,50",
            "74,75",
            "99,100"
    })
    public void RadioStationNumberReduce(int expected,int numberRadioStation){
        Radio cond = new Radio(numberRadioStation);
        cond.setNumberRadioStation(numberRadioStation);
        cond.reduceNumberRadioStation();

        int actual = cond.getNumberRadioStation();

        Assertions.assertEquals(expected, actual);
    }
    @ParameterizedTest
    @CsvSource({
            "9,10",
            "24,25",
            "49,50",
            "74,75",
            "99,100"
    })
    public void RadioStationNumberIncrease(int expected,int numberRadioStation){
        Radio cond = new Radio(numberRadioStation);
        cond.setNumberRadioStation(numberRadioStation);
        cond.increaseNumberRadioStation();

        int actual = cond.getNumberRadioStation();

        Assertions.assertEquals(expected, actual);
    }

}