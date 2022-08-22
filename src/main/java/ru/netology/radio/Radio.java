package ru.netology.radio;

public class Radio {
    private int currentStation;
    private int volume;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation > 9) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void setToMinStation() {
        currentStation = 0;
    }

    public void setToMaxStation() {
        currentStation = 9;
    }


        public void changeOnPreviousRadioStation() {
            if (currentStation <= 0) {
                currentStation = 9;
            }
            else {
                currentStation = currentStation - 1;
            }
        }


        public void changeOnNextRadioStation () {
            if (currentStation == 9) {
                currentStation = 0;
            }
            else {
                currentStation = currentStation + 1;
            }
        }


        public int getVolume () {
            return volume;
        }

        public void setVolume ( int newVolume){
            if (newVolume < 0) {
                return;
            }
            if (newVolume > 10) {
                return;
            }
            volume = newVolume;
        }

        public void setToMaxVolume () {
            volume = 10;
        }


        public void increaseVolume () {
            if (volume < 10) {
                volume = volume + 1;
            }
        }

        public void setToMinVolume () {
            volume = 0;
        }


        public void decreaseVolume () {
            if (volume > 0) {
                volume = volume - 1;
            }
        }

}
