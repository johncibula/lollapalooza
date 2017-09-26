package com.chicagotrading.lolla;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class ControlBoard {

  public static ControlBoard controlBoard =  new ControlBoard();

  public static ControlBoard getInstance() {
    return controlBoard;
  }

  public Performance newPerformance(EventTime eventTime,Band band, Stage stage) {
    return new Performance(eventTime, band, stage);
  }

  public void addSong(List<Song> songs, Song song){
    songs.add(song);
  }

  public void addEffect(List<SpecialEffect> effects, SpecialEffect effect) {
    effects.add(effect);
  }
}
