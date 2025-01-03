package br.com.nahtanm.build.builder;

import br.com.nahtanm.build.car.Car;
import br.com.nahtanm.build.car.CarType;
import br.com.nahtanm.build.components.Engine;
import br.com.nahtanm.build.components.GPSNavigator;
import br.com.nahtanm.build.components.Transmission;
import br.com.nahtanm.build.components.TripComputer;

public class CarBuilder implements Builder {

    private Integer seats;
    private CarType type;
    private Engine engine;
    private Transmission transmission;
    private GPSNavigator gpsNavigator;
    private TripComputer computer;

    @Override
    public void setCarType(CarType type) {
        this.type = type;
    }

    @Override
    public void setSeats(Integer seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setTripComputer(TripComputer computer) {
        this.computer = computer;
    }

    @Override
    public void setGPSNavegator(GPSNavigator gpsNavegator) {
        this.gpsNavigator = gpsNavegator;
    }

    public Car getCarBuilder() {
        return new Car(seats, type, engine, transmission, gpsNavigator, computer);
    }

}
