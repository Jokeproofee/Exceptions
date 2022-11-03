package driver;
import transport.Competing;
import transport.Trucks;


public class CategoryC <T extends Trucks & Competing> extends Driver {

    public CategoryC(String fullName, boolean driverLicense, int experience) {
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