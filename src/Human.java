import devices.Car;
import devices.Device;

import java.time.LocalDateTime;

public class Human {
    private Animal pet;
    private Car car;
    private double salary;

    public Human(Animal pet) {
        this.pet = pet;
    }

    public Animal getPet() {
        return pet;
    }

    public void setPet(Animal pet) {
        this.pet = pet;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car newCar) {
        if (salary > newCar.getValue()) {
            System.out.println("Kupiłeś pojazd za gotówkę.");
            this.car = newCar;
        } else if (salary > newCar.getValue() / 12) {
            System.out.println("Kupiłeś pojazd na kredyt, nie przejmuj się. Na pewno go spłacisz.");
            this.car = newCar;
        } else {
            System.out.println("Nie stać cię. Zmień pracę bądź idź po podwyżkę.");
        }
    }

    public double getSalary() {
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Dane dotyczące wynagrodzenia z dnia: " + now);
        return salary;
    }

    public void setSalary(double salary) {
        if (salary < 0) {
            System.out.println("Błąd: Nie można ustawić ujemnej wartości wypłaty.");
            return;
        }
        System.out.println("Nowe dane zostały wysłane do systemu księgowego.");
        System.out.println("Proszę pilnie odebrać aneks do umowy od pani Hanny z kadr.");
        System.out.println("ZUS jak i US już wiedzą o zmianie wypłaty. Nie ma sensu ukrywać swojego dochodu.");
        this.salary = salary;

        }

}

