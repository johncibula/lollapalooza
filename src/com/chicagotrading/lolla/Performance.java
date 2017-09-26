package com.chicagotrading.lolla;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Performance
{
  private EventTime eventTime;
  private Band band;
  private Stage stage;

  private List<Song> songs = new ArrayList();

  public List<Song> getSongs() {
    return songs;
  }

  public Performance(EventTime eventTime, Band band, Stage stage) {
    this.eventTime = eventTime;
    this.band = band;
    this.stage = stage;
  }

  public Song newSong(String title, Duration duration) {
    Song song = new Song(title,duration);
    ControlBoard.getInstance().addSong(songs,song);
    return song;
  }


}
