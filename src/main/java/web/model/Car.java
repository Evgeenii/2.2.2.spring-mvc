package web.model;

import java.util.Objects;

public class Car {
    private String model;
    private int series;
    private int year;

    public Car(String model, int series, int year) {
        this.model = model;
        this.series = series;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Car car = (Car) o;
        return getSeries() == car.getSeries() &&
               getYear() == car.getYear() &&
               Objects.equals(getModel(), car.getModel());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getModel(), getSeries(), getYear());
    }

    @Override
    public String toString() {
        return "Car{" +
               "model='" + model + '\'' +
               ", series=" + series +
               ", year=" + year +
               '}';
    }
}
