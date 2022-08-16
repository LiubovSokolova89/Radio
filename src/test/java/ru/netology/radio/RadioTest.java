package ru.netology.radio;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {


    @Test
    public void shouldSetCurrentRadioStationBackToZero() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);
<<<<<<< Updated upstream
        radio.decreaseRadioStation();
=======
>>>>>>> Stashed changes
        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldMaxRadioStation() {
        Radio radio = new Radio();
        radio.setToMaxStation();
<<<<<<< Updated upstream
        radio.changeOnPreviousRadioStation();
        radio.increaseRadioStation();
=======
>>>>>>> Stashed changes
        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMinRadioStation() {
        Radio radio = new Radio();
        radio.setToMinStation();
<<<<<<< Updated upstream
        radio.changeOnNextRadioStation();
=======
>>>>>>> Stashed changes
        int expected = 0;
        int actual = radio.getCurrentStation();

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
<<<<<<< Updated upstream
        radio.decreaseRadioStation();
=======
        radio.changeOnPreviousRadioStation();
>>>>>>> Stashed changes
        int expected = 6;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldChangeOnNextRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);
<<<<<<< Updated upstream
        radio.increaseRadioStation();
=======
        radio.changeOnNextRadioStation();
>>>>>>> Stashed changes
        int expected = 2;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldMaxVolume() {
        Radio radio = new Radio();
        radio.setToMaxVolume();
        int expected = 10;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected , actual);
    }

    @Test
    public void shouldMinVolume() {
        Radio radio = new Radio();
        radio.setToMinVolume();
        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected , actual);
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
<<<<<<< Updated upstream
        radio.increaseVolume();
=======
        radio.changeVolume();
>>>>>>> Stashed changes
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
<<<<<<< Updated upstream
        radio.increaseVolume();
=======
        radio.changeVolume();
>>>>>>> Stashed changes
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