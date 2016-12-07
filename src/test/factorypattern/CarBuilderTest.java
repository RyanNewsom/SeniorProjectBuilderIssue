package test.factorypattern;

import main.RyLog;
import main.factorypattern.CarBuilder;
import main.model.Car;
import main.model.CarDb;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import sun.misc.ASCIICaseInsensitiveComparator;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Ryan on 12/6/2016.
 */
public class CarBuilderTest {
    private static final String TAG = "CarBuilderTest";
    private Car mDomainCar;
    private CarDb mDatabaseCar;
    List<Car> cars;
    List<CarDb> dbCars;

    private final Car car1 = new Car("Subaru", "Wrx");
    private final Car car2 = new Car("Ford", "Mustang GT350R");
    private final Car car3 = new Car("Dodge", "Challenger Hellcat");
    private final Car car4 = new Car("Chevy", "Bel-Air");
    private final Car car5 = new Car("Nissan", "R34 GTR");
    private final Car car6 = new Car("Porsche", "997 Turbo S");

    private final CarDb carDb1 = new CarDb("Subaru", "Rs");
    private final CarDb carDb2 = new CarDb("Ford", "Focus RS");
    private final CarDb carDb3 = new CarDb("Dodge", "Viper");
    private final CarDb carDb4 = new CarDb("Lamborghini", "Gallardo");
    private final CarDb carDb5 = new CarDb("Toyota", "Supra");
    private final CarDb carDb6 = new CarDb("Audi", "R8");





    @Before
    public void setUp() throws Exception {

        cars = new ArrayList<>();
        dbCars = new ArrayList<>();

        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
        cars.add(car6);

        dbCars.add(carDb1);
        dbCars.add(carDb2);
        dbCars.add(carDb3);
        dbCars.add(carDb4);
        dbCars.add(carDb5);
        dbCars.add(carDb6);
    }

    @Test
    public void testNestedChildrenOfSameType(){
        CarDb carDb = new CarDb("Tesla", "Model S P90D", dbCars);
        Car car = CarBuilder.build(carDb);

        RyLog.d(TAG, car.toString());
        Assert.assertNotNull(car);
    }
}