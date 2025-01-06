package br.com.nahtanm.build.car;

import br.com.nahtanm.build.components.Engine;
import br.com.nahtanm.build.components.GPSNavigator;
import br.com.nahtanm.build.components.Transmission;
import br.com.nahtanm.build.components.TripComputer;

public class Car {

    private Integer seats;
    private CarType type;
    private Engine engine;
    private Transmission transmission;
    private GPSNavigator gpsNavigator;
    private TripComputer computer;
    private double fuel = 0;

    public Car() {
    }

    public Car(Integer seats, CarType type, Engine engine, Transmission transmission, GPSNavigator gpsNavigator, TripComputer computer) {
        this.seats = seats;
        this.type = type;
        this.engine = engine;
        this.transmission = transmission;
        this.gpsNavigator = gpsNavigator;
        this.computer = computer;
    }

    public Integer getSeats() {
        return seats;
    }

    public void setSeats(Integer seats) {
        this.seats = seats;
    }

    public CarType getType() {
        return type;
    }

    public void setType(CarType type) {
        this.type = type;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public GPSNavigator getGpsNavigator() {
        return gpsNavigator;
    }

    public void setGpsNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }

    public TripComputer getComputer() {
        return computer;
    }

    public void setComputer(TripComputer computer) {
        this.computer = computer;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    @Override
    public String toString() {
        return "Car{" +
                "seats=" + seats +
                ", type=" + type +
               ", " +  engine.toString() +
                ", transmission=" + transmission +
                ", gpsNavigator=" + gpsNavigator +
                ", computer=" + computer +
                '}';
    }
}
