package driver;

import transport.Bus;
import transport.Competing;

public class CategoryD <T extends Bus & Competing> extends Driver {

    public CategoryD(String fullName, boolean driverLicense, int experience) {
        super(fullName, driverLicense, experience);
    }

    @Override
    public void startMoving() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void reFuel() {

    }

    public void race(T car) {
        System.out.println("Водитель " + getFullName() + " управляет автомобилем " + car + " и будет участвовать в заезде.");
    }
}