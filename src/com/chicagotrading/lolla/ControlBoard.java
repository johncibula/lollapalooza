package com.chicagotrading.lolla;

public class ControlBoard {

  private ControlBoard() {}

  public static ControlBoard getInstance() {
    return new ControlBoard();
  }

  public Performance newPerformance(EventTime eventTime,Band band, Stage stage) {
    return new Performance(eventTime, band, stage);
  }
}
