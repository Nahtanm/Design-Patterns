package br.com.nahtanm.build;

import br.com.nahtanm.build.builder.Builder;
import br.com.nahtanm.build.builder.CarBuilder;
import br.com.nahtanm.build.builder.CarManualBuilder;
import br.com.nahtanm.build.car.Car;
import br.com.nahtanm.build.car.Manual;
import br.com.nahtanm.build.director.Director;

public class Demo {
    public static void main(String[] args) {
        Director director = new Director();

        CarBuilder carBuilder = new CarBuilder();
        director.builderCityCar(carBuilder);

        CarManualBuilder carManualBuilder = new CarManualBuilder();

        Car car = carBuilder.getCarBuilder();
        Manual manual = carManualBuilder.getManualBuilder();

        System.out.println(car.toString());
    }
}
