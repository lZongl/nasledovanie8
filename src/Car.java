public class Car extends Vehicle {
    int numberOfDoors;


    public Car(String make, String model, int year, int numberOfDoors) {
        super(make, model, year);
        this.numberOfDoors = numberOfDoors;//слелал на уроке
    }

    @Override
    void getDescription() {
        super.getDescription();//слелал на уроке
        System.out.println("Количество дверей: "+numberOfDoors);
    }
}

