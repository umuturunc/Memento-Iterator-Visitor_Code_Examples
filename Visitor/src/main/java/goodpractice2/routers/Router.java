package goodpractice2.routers;

import goodpractice2.visitors.RouterVisitor;

public interface Router {
    void sendData(char[] data);
    void acceptData(char[] data);

    void accept(RouterVisitor v);
}
