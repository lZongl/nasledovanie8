public class Motorcycle extends Vehicle {
    boolean hasSidecar;

    public Motorcycle(String make, String model,int year, boolean hasSidecar) {
        super(make, model, year);//слелал на уроке
        this.hasSidecar = hasSidecar;
    }

    void getDescription() {
        super.getDescription();
        if (hasSidecar = true)
            System.out.println("Есть ли коляска: да");//слелал на уроке
        else System.out.println("Есть ли коляска: нет");
    }
}
