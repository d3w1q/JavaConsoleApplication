package devices;

public class Phone extends Device {
    public Phone(String brand, String model, int yearOfProduction) {
        super(brand, model, yearOfProduction);
    }
    @Override
    public void turnOn() {
        System.out.println("Wciskasz odseparowany klawisz na swoim smartfonie.\n" +
                "Widzisz że ekran się delikatnie podświetlił co oznacza że urządzenie się uruchomiło [Brak amoleda].\n" +
                "Wyświetla się logo producenta.\n" +
                "Logo producenta wyświetla się przez około minutę.\n" +
                "Widzisz właśnie ekran startowy. Telefon pomyślnie się uruchomił.");
    }
    @Override
    public String toString() {
        return "Phone {" +
                "brand='" + getBrand() + '\'' +
                ", model='" + getModel() + '\'' +
                ", yearOfProduction=" + getYearOfProduction() +
                '}';
    }
}
