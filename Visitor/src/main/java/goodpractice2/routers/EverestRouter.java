package goodpractice2.routers;

import goodpractice2.visitors.RouterVisitor;

public class EverestRouter implements Router {
    @Override
    public void sendData(char[] data) {

    }

    @Override
    public void acceptData(char[] data) {

    }

    @Override
    public void accept(RouterVisitor v) {
        v.visit(this);
    }
}
