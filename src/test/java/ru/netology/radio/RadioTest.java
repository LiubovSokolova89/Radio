

package ru.netology.radio;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void validateChangFields() {
        Radio radio = new Radio(10);

        Assertions.assertEquals(9, radio.getMaxStation());
        Assertions.assertEquals(0, radio.getMinStation());
        Assertions.assertEquals(0, radio.getCurrentStation());
        Assertions.assertEquals(0 , radio.getMinVolume());
        Assertions.assertEquals(100, radio.getMaxVolume());
        Assertions.assertEquals(0, radio.getVolume());
    }

    @Test
    public void testRadioConstructors() {
        Radio radio = new Radio();
        int expected = 0;
        int actual = radio.getCurrentStation();


        Assertions.assertEquals(expected , actual);

    }


    @Test
    public void shouldSetCurrentRadioStationBackToZero() {
        Radio radio = new Radio(10);
        radio.setCurrentStation(10);
        radio.decreaseRadioStation();


        Assertions.assertEquals(0, radio.getCurrentStation());
    }


    @Test
    public void shouldMaxRadioStation() {
        Radio radio = new Radio(10);
        radio.setToMaxStation();
        radio.changeOnPreviousRadioStation();
        radio.increaseRadioStation();


        Assertions.assertEquals(9, radio.getMaxStation());
    }

    @Test
    public void shouldMinRadioStation() {
        Radio radio = new Radio(10);
        radio.setToMinStation();
        radio.changeOnNextRadioStation();

        Assertions.assertEquals(0, radio.getCurrentStation());
    }


    @Test
    public void shouldSetCurrentRadioStation() {
        Radio radio = new Radio(10);
        radio.setCurrentStation(-1);


        Assertions.assertEquals(0, radio.getCurrentStation());
    }


    @Test
    public void shouldChangeOnPreviousRadioStationIfStationIsMin() {
        Radio radio = new Radio(10);
        radio.setCurrentStation(0);
        radio.changeOnPreviousRadioStation();


        Assertions.assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void shouldChangeOnPreviousRadioStationIfStationIsMax() {
        Radio radio = new Radio(10);
        radio.setCurrentStation(9);
        radio.changeOnNextRadioStation();


        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void shouldChangeOnPreviousRadioStation() {
        Radio radio = new Radio(10);
        radio.setCurrentStation(7);
        radio.decreaseRadioStation();


        Assertions.assertEquals(6, radio.getCurrentStation());
    }

    @Test
    public void shouldChangeOnNextRadioStation() {
        Radio radio = new Radio(10);
        radio.setCurrentStation(1);
        radio.increaseRadioStation();


        Assertions.assertEquals(2, radio.getCurrentStation());
    }


    @Test
    public void shouldMaxVolume() {
        Radio radio = new Radio(10);
        radio.setToMaxVolume();


        Assertions.assertEquals(100, radio.getVolume());
    }

    @Test
    public void shouldMinVolume() {
        Radio radio = new Radio(10);
        radio.setToMinVolume();


        Assertions.assertEquals(0, radio.getVolume());
    }

    @Test
    public void shouldSetVolumeIfVolumeIsOverMax() {
        Radio radio = new Radio(10);
        radio.setVolume(101);


        Assertions.assertEquals(0, radio.getVolume());
    }

    @Test
    public void shouldSetVolumeIfVolumeIsUnderMin() {
        Radio radio = new Radio(10);
        radio.setVolume(-1);


        Assertions.assertEquals(0, radio.getVolume());
    }

    @Test
    public void volumeUpForOne() {
        Radio radio = new Radio(10);
        radio.setVolume(6);
        radio.increaseVolume();


        Assertions.assertEquals(7, radio.getVolume());

    }

    @Test
    public void volumeDownForOne() {
        Radio radio = new Radio(10);
        radio.setVolume(99);
        radio.decreaseVolume();


        Assertions.assertEquals(98, radio.getVolume());
    }

    @Test
    public void shouldNotChangeVolumeIfVolumeIsMax() {
        Radio radio = new Radio(10);
        radio.setToMaxVolume();
        radio.increaseVolume();


        Assertions.assertEquals(100, radio.getVolume());
    }

    @Test
    public void shouldNotChangeVolumeIfVolumeIsMin() {
        Radio radio = new Radio(10);
        radio.setVolume(0);
        radio.decreaseVolume();


        Assertions.assertEquals(0, radio.getVolume());

    }

}