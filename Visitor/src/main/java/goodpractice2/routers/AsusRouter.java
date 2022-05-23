package goodpractice2.routers;

import goodpractice2.visitors.RouterVisitor;

public class AsusRouter implements Router {
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
