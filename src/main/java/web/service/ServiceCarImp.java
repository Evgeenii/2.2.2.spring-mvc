package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ServiceCarImp implements ServiceCar{
    private static final List<Car> cars = new ArrayList<>();

    static {
        cars.add(new Car("BMW", 520, 1992));
        cars.add(new Car("AUDI", 6, 2000));
        cars.add(new Car("PORSCHE", 911, 2005));
        cars.add(new Car("VAZ", 2106, 1992));
        cars.add(new Car("GAZ", 21, 1970));

    }

    @Override
    public List<Car> findCar(int count) {
        return cars.stream()
                .limit(count)
                .collect(Collectors.toList());
    }
}
