package transport;

import java.util.Objects;

public abstract class Transport {

    private String brand;
    private String model;
    private double engineVolume;

    public Transport(String brand, String model, double engineVolume) {
        this.brand = Utility.checkNull(brand,"default");
        this.model = Utility.checkNull(model,"default");
        this.engineVolume = Utility.checkDouble(engineVolume,1.5);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        Utility.checkDouble(engineVolume,1.5);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return Double.compare(transport.engineVolume, engineVolume) == 0 && Objects.equals(brand, transport.brand) && Objects.equals(model, transport.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineVolume);
    }

    public abstract void startMoving();

    public abstract void finishTheMovement();

    public abstract boolean passDiagnostics ();
}