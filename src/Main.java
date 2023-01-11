import devices.Car;

public class Main {
    public static void main(String[] args) {


        Animal dog = new Animal("Dog", 10.5);
        Human jan = new Human(dog);
        jan.setSalary(2500.0);

        System.out.println(jan.getSalary());

        Car car = new Car("Caro", "Polonez");
        car.setValue(10000.0);
        jan.setCar(car);

        Car car1 = new Car("Caro", "Polonez");
        car1.setValue(10000.0);

        if (car1.equals(car1)){
            System.out.println("Auta są takie same.");
        } else {
            System.out.println("Auta nie są takie same.");
        }

        System.out.println(dog);
        System.out.println(car);
        System.out.println(car1);

        System.out.println(jan.getPet().getSpecies());
        System.out.println(jan.getPet().getWeight());
        System.out.println(jan.getCar().getModel());
        System.out.println(jan.getCar().getProducer());

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
