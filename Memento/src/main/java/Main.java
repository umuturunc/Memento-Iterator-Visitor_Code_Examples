public class Main {
    public static void main(String[] args) {
        //Originator & CareTaker instantiate
        Car_Originator car = new Car_Originator();
        CareTaker careTaker = new CareTaker();

        car.location = "İstanbul";
        car.print();
        careTaker.addMemento(car.save());

        car.location = "Ankara";
        car.print();
        careTaker.addMemento(car.save());

        System.out.println("Restore car from Memento");
        car.restore(careTaker.getMemento(0));
        car.print();

    }
}
