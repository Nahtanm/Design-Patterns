package br.com.nahtanm.build.director;

import br.com.nahtanm.build.builder.Builder;
import br.com.nahtanm.build.car.CarType;
import br.com.nahtanm.build.components.Engine;
import br.com.nahtanm.build.components.GPSNavigator;
import br.com.nahtanm.build.components.Transmission;
import br.com.nahtanm.build.components.TripComputer;

public class Director {

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

}
