package example.collections;

import example.Notebook;
import example.iterators.Iterator;
import example.iterators.NotebookIterator;

//ConcreteCollection
//Koleksiyon
public class NotebookStore implements IterableCollection {
    private Notebook[] notebookList;

    //Constructor
    public NotebookStore() {
        notebookList = new Notebook[]{
                new Notebook("Notebok1"),
                new Notebook("Notebok2"),
                new Notebook("Notebok3"),
                new Notebook("Notebok4"),
                new Notebook("Notebok5"),
        };
    }

    @Override
    public Iterator iterator() {
        return new NotebookIterator(notebookList);
    }
}
