import devices.Car;
import devices.Device;
import devices.Phone;

public class Main {
    public static void main(String[] args) {

        Animal dog = new Animal("Dog", 10.5);
        Human jan = new Human(dog);
        jan.setSalary(2500.0);

        System.out.println(jan.getSalary());

        Phone device = new Phone("Google", "Pixel 4", 2018);

        Car car = new Car("Polonez", "Caro", 1996, 10000);
        jan.setCar(car);

        System.out.println(device);
        System.out.println(car);
        device.turnOn();
        car.turnOn();

        Car car1 = new Car("Polonez", "Caro", 1996, 10000);

        if (car1.equals(car1)){
            System.out.println("Auta są takie same.");
        } else {
            System.out.println("Auta nie są takie same.");
        }

        System.out.println(dog);


        System.out.println(jan.getPet().getSpecies());
        System.out.println(jan.getPet().getWeight());

        Animal animal = new Animal("Dog", 10.5);
        animal.takeForAWalk();
        animal.takeForAWalk();
        animal.takeForAWalk();
        animal.takeForAWalk();
        animal.takeForAWalk();
        System.out.println(animal.getWeight());
        animal.takeForAWalk();
        animal.takeForAWalk();
        animal.takeForAWalk();
        animal.takeForAWalk();
        animal.takeForAWalk();
        animal.takeForAWalk();
        animal.takeForAWalk();
        animal.takeForAWalk();
        System.out.println(animal.getWeight());
        animal.takeForAWalk();
        animal.takeForAWalk();
        animal.takeForAWalk();
        animal.takeForAWalk();
        animal.takeForAWalk();
        animal.takeForAWalk();
        animal.takeForAWalk();
        animal.takeForAWalk();
        System.out.println(animal.getWeight());
        animal.feed();


    }
}
