package devices;

public class Car extends Device {
    private double value;

    public Car(String brand, String model, int yearOfProduction, double value) {
        super(brand, model, yearOfProduction);
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public void turnOn() {
        System.out.println("Wkładasz kluczyki do stacyjki.\n" +
                "Naduszasz sprzęgło.\n" +
                "Trzymając sprzęgło łapiesz za kluczyki i je przekręcasz.\n" +
                "Pojazd został uruchomiony..");
    }

    public String getProducer() {
        return getBrand();
    }

    @Override
    public String toString() {
        return "Car {" +
                "value=" + value +
                ", brand='" + getBrand() + '\'' +
                ", model='" + getModel() + '\'' +
                ", yearOfProduction=" + getYearOfProduction() +
                '}';
    }
}
