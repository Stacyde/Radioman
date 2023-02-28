package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.Radio;

public class RadioTest {
    @ParameterizedTest
    @CsvSource({
            "0,0",
            "10,10",
            "5,5",
            "0,11",
            "0,-1"
    })
    public void volume(int expected, int newCurrentVolume) {
        Radio cond = new Radio();
        cond.setCurrentVolume(newCurrentVolume);

        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
@ParameterizedTest
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
    @ParameterizedTest
    @CsvSource({
            "1,0",
            "6,5",
            "10,10",
            "10,9"
    })
    public void increaseVolume(int expected, int newCurrentVolume) {
        Radio cond = new Radio();
        cond.setCurrentVolume(newCurrentVolume);
        cond.increaseVolume(newCurrentVolume);

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
        cond.increaseRadioStation(newCurrentStation);

        int actual = cond.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "0,0",
            "4,5",
            "9,10"
    })
    public void reduceVolume(int expected, int newCurrentVolume) {
        Radio cond = new Radio();
        cond.setCurrentVolume(newCurrentVolume);
        cond.reduceVolume(newCurrentVolume);

        int actual = cond.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @ParameterizedTest
    @CsvSource({
            "9,0",
            "4,5",
            "8,9"
    })
    public void radioStationReduce(int expected, int newCurrentStation) {
        Radio cond = new Radio();
        cond.setCurrentRadioStation(newCurrentStation);
        cond.reduceRadioStation(newCurrentStation);

        int actual = cond.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }
}