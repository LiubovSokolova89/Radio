package ru.netology.radio;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {


    @Test
    public void shouldSetCurrentRadioStationBackToZero() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);
        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMaxRadioStation() {
        Radio radio = new Radio();
        radio.setToMaxStation();
        int expected = 9;
        int actual = radio.currentStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMinRadioStation() {
        Radio radio = new Radio();
        radio.setToMinStation();
        int expected = 0;
        int actual = radio.currentStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldChangeOnPreviousRadioStationIfStationIsMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.changeOnPreviousRadioStation();
        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldChangeOnPreviousRadioStationIfStationIsMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.changeOnNextRadioStation();
        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldChangeOnPreviousRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(7);
        radio.decreaseRadioStation();
        int expected = 6;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldChangeOnNextRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(7);
        radio.increaseRadioStation();
        int expected = 8;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeIfVolumeIsOverMax() {
        Radio radio = new Radio();
        radio.setVolume(11);
        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeIfVolumeIsUnderMin() {
        Radio radio = new Radio();
        radio.setVolume(-1);
        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeUpForOne() {
        Radio radio = new Radio();
        radio.setVolume(6);
        radio.increaseVolume();
        int expected = 7;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void volumeDownForOne() {
        Radio radio = new Radio();
        radio.setVolume(9);
        radio.decreaseVolume();
        int expected = 8;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotChangeVolumeIfVolumeIsMax() {
        Radio radio = new Radio();
        radio.setVolume(10);
        radio.increaseVolume();
        int expected = 10;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotChangeVolumeIfVolumeIsMin() {
        Radio radio = new Radio();
        radio.setVolume(0);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);

    }

}