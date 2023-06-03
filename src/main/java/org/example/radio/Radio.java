package org.example.radio;

public class Radio {

    public int currentRadioStation;
    public int currentVolume;

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation >= 0) {
           if (newCurrentRadioStation <= 9) {
                currentRadioStation = newCurrentRadioStation;
            }
        }
    }

    public void prevCurrentStation() {
        if (currentRadioStation == 0) {
            currentRadioStation = 9;
        } else if (currentRadioStation <= 9) {
            currentRadioStation--;
        }
    }

    public void nextCurrentStation() {
        if (currentRadioStation == 9) {
            currentRadioStation = 0;
        } else if (currentRadioStation >= 0) {
            currentRadioStation++;
        }
    }
      public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > 0) {
            if (newCurrentVolume <= 100) {
                currentVolume = newCurrentVolume;
            }
        }
    }
    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }
    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}





