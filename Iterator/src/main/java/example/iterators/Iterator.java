package example.iterators;

import example.Notebook;

public interface Iterator {
    //Sırada eleman var mı?
    boolean hasNext();
    //Sonraki eleman
    Notebook nextElement();
}
