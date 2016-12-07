package main.model;

import java.util.List;

/**
 * Created by Ryan on 12/6/2016.
 */
public class CarDb extends Car {
    public CarDb(String manufacturer, String model, List<Car> cars) {
        super(manufacturer, model, cars);
    }


    public CarDb(String manufacturer, String model) {
        super(manufacturer, model);
    }


}
