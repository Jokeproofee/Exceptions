package driver;

import transport.Utility;

import java.util.Objects;

public abstract class Driver {
    private String fullName;
    private boolean driverLicense;
    private int experience;

    public Driver(String fullName, boolean driverLicense, int experience) {
        this.fullName = Utility.checkNull(fullName,"default");
        setDriverLicense(driverLicense);
        this.experience = Utility.checkInt(experience,0);
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = Utility.checkNull(fullName,"default");
    }

    public boolean getDriverLicense() {
        return driverLicense;
    }

    public void setDriverLicense(boolean driverLicense) {
        if (!driverLicense) {
            throw new IllegalArgumentException("Необходимо указать категорию прав!");
        }
        this.driverLicense = driverLicense;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = Utility.checkInt(experience,0);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver driver = (Driver) o;
        return driverLicense == driver.driverLicense && experience == driver.experience && Objects.equals(fullName, driver.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, driverLicense, experience);
    }

    public abstract void startMoving ();

    public abstract void stop ();

    public abstract void reFuel ();
}