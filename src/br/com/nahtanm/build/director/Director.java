package br.com.nahtanm.build.director;

import br.com.nahtanm.build.builder.Builder;
import br.com.nahtanm.build.builder.Builder2;
import br.com.nahtanm.build.builder.SienaCarBuilder;
import br.com.nahtanm.build.car.Car;
import br.com.nahtanm.build.car.CarType;
import br.com.nahtanm.build.components.Engine;
import br.com.nahtanm.build.components.GPSNavigator;
import br.com.nahtanm.build.components.Transmission;
import br.com.nahtanm.build.components.TripComputer;

public class Director {

    private Builder2 builder2;

    public void setBuilder2(Builder2 builder2){
        this.builder2 = builder2;
    }

    public void builderCityCar(Builder builder){
        builder.setSeats(4);
        builder.setCarType(CarType.CITY_CAR);
        builder.setEngine(new Engine(1.3,0));
        builder.setTransmission(Transmission.MANUAL);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavegator(new GPSNavigator("Rua izidorio gomes "));
    }

    public void builderSportsCar(Builder builder){
        builder.setSeats(2);
        builder.setCarType(CarType.SPORTS_CAR);
        builder.setEngine(new Engine(2.0,0));
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavegator(new GPSNavigator("Rua izidorio gomes "));
    }

    public void builderSUVCar(Builder builder){
        builder.setSeats(4);
        builder.setCarType(CarType.SUV);
        builder.setEngine(new Engine(2.0,0));
        builder.setTransmission(Transmission.SEMI_AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavegator(new GPSNavigator("Rua izidorio gomes "));
    }

    public Car builderSiena(){

        builder2.setCarType();
        builder2.setEngine();
        builder2.setSeats();
        builder2.setEngine();
        builder2.setTransmission();
        builder2.setTripComputer();
        builder2.setGPSNavegator();

        return builder2.builderCar();
    }

}
