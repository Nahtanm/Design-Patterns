package br.com.nahtanm.build.builder;

import br.com.nahtanm.build.car.Car;
import br.com.nahtanm.build.car.CarType;
import br.com.nahtanm.build.components.Engine;
import br.com.nahtanm.build.components.GPSNavigator;
import br.com.nahtanm.build.components.Transmission;
import br.com.nahtanm.build.components.TripComputer;

public class SienaCarBuilder implements Builder2 {

    private Integer seats;
    private CarType type;
    private Engine engine;
    private Transmission transmission;
    private GPSNavigator gpsNavigator;
    private TripComputer computer;

    @Override
    public void setCarType() {
        this.type = CarType.CITY_CAR;
    }

    @Override
    public void setSeats() {
        this.seats = 5;
    }

    @Override
    public void setEngine() {
        this.engine = new Engine(0, 1.4);
        this.engine.setStarted(true);
    }

    @Override
    public void setTransmission() {
        this.transmission = Transmission.MANUAL;
    }

    @Override
    public void setTripComputer() {
        this.computer = null;
    }

    @Override
    public void setGPSNavegator() {
     this.gpsNavigator = null;
    }

    @Override
    public Car builderCar() {
        return new Car(this.seats, this.type, this.engine, this.transmission,this.gpsNavigator,this.computer);
    }

}
