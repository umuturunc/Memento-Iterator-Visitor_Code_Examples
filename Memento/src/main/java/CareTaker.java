import java.util.ArrayList;

public class CareTaker {
    //Geçmiş durumların tutulduğu liste
    ArrayList<Memento> history = new ArrayList<>();

    //Yeni bir Memento nesnesi al
    public void addMemento(Memento memento) {
        history.add(memento);
    }

    //history listesindeki bir Memento'ta erişmek için
    public Memento getMemento(int index) {
        return history.get(index);
    }
}
