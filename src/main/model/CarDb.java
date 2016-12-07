package main.model;

import java.util.List;

/**
 * Created by Ryan on 12/6/2016.
 */
public class CarDb extends Car {
    private List<CarDb> mOtherCarsDb;

    public CarDb(String manufacturer, String model, List<CarDb> cars) {
        super(manufacturer, model);
        mOtherCarsDb = cars;
    }


    public CarDb(String manufacturer, String model) {
        super(manufacturer, model);
    }

    public List<CarDb> getOtherCarsDb() {
        return mOtherCarsDb;
    }
}
