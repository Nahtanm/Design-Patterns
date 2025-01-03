package br.com.nahtanm.build.car;

import br.com.nahtanm.build.components.Engine;
import br.com.nahtanm.build.components.GPSNavigator;
import br.com.nahtanm.build.components.Transmission;
import br.com.nahtanm.build.components.TripComputer;

public class Manual {
    private Integer seats;
    private CarType type;
    private Engine engine;
    private Transmission transmission;
    private GPSNavigator gpsNavigator;
    private TripComputer computer;

    public Manual(Integer seats, CarType type, Engine engine, Transmission transmission, GPSNavigator gpsNavigator, TripComputer computer) {
        this.seats = seats;
        this.type = type;
        this.engine = engine;
        this.transmission = transmission;
        this.gpsNavigator = gpsNavigator;
        this.computer = computer;
    }

    @Override
    public String toString() {
        return "Manual{" +
                "seats=" + seats +
                ", type=" + type +
                ", engine=" + engine +
                ", transmission=" + transmission +
                ", gpsNavigator=" + gpsNavigator +
                ", computer=" + computer +
                '}';
    }
}
