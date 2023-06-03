package org.example.radio.test;

import org.example.radio.Radio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test

    public void shouldSetRadioStation() {

        Radio radio = new Radio();
        radio.setCurrentRadioStation(8);
        int expected = 8;
        int actual = radio.currentRadioStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMaxRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(9);
        int expected = 9;
        int actual = radio.currentRadioStation;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotToSetRadioStationBelowMin() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(-1);
        int expected = 0;
        int actual = radio.currentRadioStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotToSetRadioStationAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(15);
        int expected = 0;
        int actual = radio.currentRadioStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPressPrevRadioStation() {
        Radio radio = new Radio();
        radio.currentRadioStation = 7;
        radio.prevCurrentStation();
        int expected = 6;
        int actual = radio.currentRadioStation;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldPressPrevRadioStationMax() {
        Radio radio = new Radio();
        radio.currentRadioStation = 10;
        radio.prevCurrentStation();
        int expected = 10;
        int actual = radio.currentRadioStation;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPressPrevRadioStationBelowMin() {
        Radio radio = new Radio();
        radio.currentRadioStation = 0;
        radio.prevCurrentStation();
        int expected = 9;
        int actual = radio.currentRadioStation;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldPressPrevRadioStationBelow() {
        Radio radio = new Radio();
        radio.currentRadioStation = -1;
        radio.nextCurrentStation();
        int expected = -1;
        int actual = radio.currentRadioStation;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPressNextRadioStation() {
        Radio radio = new Radio();
        radio.currentRadioStation = 4;
        radio.nextCurrentStation();
        int expected = 5;
        int actual = radio.currentRadioStation;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPressNextRadioStationAboveMax() {
        Radio radio = new Radio();
        radio.currentRadioStation = 9;
        radio.nextCurrentStation();
        int expected = 0;
        int actual = radio.currentRadioStation;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(56);
        int expected = 56;
        int actual = radio.currentVolume;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMaxCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        int expected = 100;
        int actual = radio.currentVolume;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMinCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        int expected = 0;
        int actual = radio.currentVolume;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPressBelowMinCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        int expected = 0;
        int actual = radio.currentVolume;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPressAboveMaxCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(123);
        int expected = 0;
        int actual = radio.currentVolume;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPressIncreaseCurrentVolume() {
        Radio radio = new Radio();
        radio.currentVolume = 56;
        radio.increaseVolume();
        int expected = 57;
        int actual = radio.currentVolume;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPressIncreaseCurrentVolumeAboveMax() {
        Radio radio = new Radio();
        radio.currentVolume = 100;
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.currentVolume;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldPressDecreaseCurrentVolume() {
        Radio radio = new Radio();
        radio.currentVolume = 58;
        radio.decreaseVolume();
        int expected = 57;
        int actual = radio.currentVolume;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldPressDecreaseCurrentVolumeBelowMin() {
        Radio radio = new Radio();
        radio.currentVolume = 0;
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.currentVolume;
        Assertions.assertEquals(expected, actual);
    }
}


