package br.com.nahtanm.build.builder;

import br.com.nahtanm.build.car.Car;

public interface Builder2 {

    Car car = new Car();

    void setCarType();
    void setSeats();
    void setEngine();
    void setTransmission();
    void setTripComputer();
    void setGPSNavegator();

    default Car builderCar(){
        return car;
    }

}
