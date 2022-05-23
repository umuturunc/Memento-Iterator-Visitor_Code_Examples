public class Car_Originator {
    //Gezilen şehrin ismi
    public String location;

    public void print() {
        System.out.println("Car (location = " + location + " )");
    }

    //Kendi bilgilerini memento nesnesine kaydet
    public Memento save() {
        return new Memento(location);
    }

    //Eski durum bilgisine geri dön
    public void restore(Memento memento) {
        this.location = memento.location;
    }
}
