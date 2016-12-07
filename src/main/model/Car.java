package main.model;

import java.util.List;

/**
 * Created by Ryan on 12/6/2016.
 */
public class Car {
    private List<Car> mOtherCars;
    private String mManufacturer;
    private String mModel;

    public Car(String manufacturer, String model){
        mManufacturer = manufacturer;
        mModel = model;
    }

    public Car(String manufacturer, String model, List<Car> otherCars){
        mOtherCars = otherCars;
        mManufacturer = manufacturer;
        mModel = model;
    }

    public List<Car> getOtherCars() {
        return mOtherCars;
    }

    public String getManufacturer() {
        return mManufacturer;
    }

    public String getModel() {
        return mModel;
    }

    @Override
    public String toString() {
        return "Car{" +
                "mManufacturer='" + mManufacturer + '\'' +
                ", mModel='" + mModel + '\'' +
                '}';
    }
}
