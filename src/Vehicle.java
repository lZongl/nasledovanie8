public class Vehicle {
    String make; //марка
    String model; //модель
    int year; //год выпуска

    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;//слелал на уроке
    }

    void getDescription(){
        System.out.println("Марка: "+make+"\n"+"Модель: "+model+"\n"+"Год:"+year);//слелал на уроке
    }

}
