package web.service;


import web.model.Car;

import java.util.List;

public interface ServiceCar {
    List<Car> findCar(int count);
}
