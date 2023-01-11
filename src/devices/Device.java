package devices;

public abstract class Device{
    private String brand;
    private String model;
    private int yearOfProduction;

    public Device(String brand, String model, int yearOfProduction) {
        this.brand = brand;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public abstract void turnOn();

    @Override
    public String toString() {
        return "Device{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }
}

