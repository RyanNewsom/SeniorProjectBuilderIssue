package main.factorypattern;

import main.model.Car;
import main.model.CarDb;

/**
 * Created by Ryan on 12/6/2016.
 */
public class CarBuilder implements ConvertTypeFactory{
    public static Car build(CarDb carDb){
        Car car = new Car(carDb.getManufacturer(), carDb.getModel(), carDb.getOtherCars());

        return car;
    }
}
