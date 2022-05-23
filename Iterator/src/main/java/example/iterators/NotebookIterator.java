package example.iterators;

import example.Notebook;

//ConcreteIterator
//Somut iterator
public class NotebookIterator implements Iterator {
    //Üzerinde gezinme işlemi gerçekleştirilecek veri yapısı.
    private Notebook[] notebookList;
    private int index = 0;

    //Constructor
    public NotebookIterator(Notebook[] notebookList) {
        this.notebookList = notebookList;
    }

    //Sırada eleman var mı?
    @Override
    public boolean hasNext() {
        return index < notebookList.length;
    }

    //Sıradaki eleman
    @Override
    public Notebook nextElement() {
        return notebookList[index++];
    }
}
