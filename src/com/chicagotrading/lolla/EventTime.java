package com.chicagotrading.lolla;

import java.time.Duration;
import java.util.Date;

public class EventTime
{

  private final Date from;
  private final Duration duration;

  public EventTime(Date from, Duration duration) {
    this.from = from;
    this.duration = duration;
  }

  public static EventTime from(Date from, Duration duration) { return new EventTime(from,duration); }
}
