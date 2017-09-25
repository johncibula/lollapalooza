package com.chicagotrading.lolla;

import java.time.Duration;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Date;


public final class Lollapalooza
{
  public static void main( String[] args )
          throws Exception
  {
    ControlBoard controlBoard = ControlBoard.getInstance();

    Stage mainStage = new MainStage();

    Performance headliner =
            controlBoard.newPerformance(
                    EventTime.from( Date.from( Instant.parse( "2017-08-06T23:30:00.000" ) ),
                            Duration.of( 120, ChronoUnit.MINUTES ) ),
                    new ArcadeFire(),
                    mainStage );

    headliner.newSong( "Everything Now", Duration.of( 357, ChronoUnit.SECONDS ) )
            .addSpecialEffect( new StrobeLight( ) )
            .addSpecialEffect( new FlameJet( ) );


    headliner.newSong( "Here Comes the Night Time", Duration.of( 428, ChronoUnit.SECONDS ) )
            .addSpecialEffect( new LaserBeam( ) )
            .addSpecialEffect( new ConfettiCannon( ) );
  }
}


