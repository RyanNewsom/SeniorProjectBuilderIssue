package main.factorypattern;

import main.RyLog;
import main.model.Car;
import main.model.CarDb;
import org.omg.CORBA.TRANSACTION_MODE;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ryan on 12/6/2016.
 */
public class CarBuilder implements ConvertTypeFactory{
    private static final String TAG = "CarBuilder";

    public static Car build(CarDb carDb){
        Car car = new Car(carDb.getManufacturer(), carDb.getModel());
        List<CarDb> carsDb = carDb.getOtherCarsDb();
        List<Car> cars = new ArrayList<>();

        if(carsDb != null) {
            for (CarDb currentCarDb : carsDb) {
                Car currentCar = build(currentCarDb);
                cars.add(currentCar);
                RyLog.d(TAG, currentCarDb.toString());
            }
        }

        car.setOtherCars(cars);

        return car;
    }
}
