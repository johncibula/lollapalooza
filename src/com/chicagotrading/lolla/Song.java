package com.chicagotrading.lolla;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Song
{
  private String title;
  private Duration duration;
  private List<SpecialEffect> effects = new ArrayList();

  public Song(String title, Duration duration) {
    this.title = title;
    this.duration = duration;
  }

  public Song addSpecialEffect(SpecialEffect effect) {
    effects.add(effect);
    return this;
  }

}
