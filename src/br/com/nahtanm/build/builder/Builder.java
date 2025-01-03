package br.com.nahtanm.build.builder;

import br.com.nahtanm.build.car.CarType;
import br.com.nahtanm.build.components.Engine;
import br.com.nahtanm.build.components.GPSNavigator;
import br.com.nahtanm.build.components.Transmission;
import br.com.nahtanm.build.components.TripComputer;

public interface Builder {

    void setCarType(CarType type);
    void setSeats(Integer seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer computer);
    void setGPSNavegator(GPSNavigator gpsNavegator);

}
