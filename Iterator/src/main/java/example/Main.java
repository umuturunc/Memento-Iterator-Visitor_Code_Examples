package example;

import example.collections.IterableCollection;
import example.collections.NotebookStore;
import example.iterators.Iterator;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        //Koleksiyonu oluştur
        IterableCollection notebookStore = new NotebookStore();
        //Koleksiyonu gezebilmek için iterator nesnesini al
        Iterator iterator = notebookStore.iterator();


        while (iterator.hasNext()) {
            System.out.println(iterator.nextElement().getName());
        }

    }
}

