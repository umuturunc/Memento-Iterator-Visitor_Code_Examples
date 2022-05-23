package goodpractice2;

import goodpractice2.routers.AsusRouter;
import goodpractice2.routers.EverestRouter;
import goodpractice2.routers.Router;
import goodpractice2.routers.TpLinkRouter;
import goodpractice2.visitors.MacOsConfigurator;
import goodpractice2.visitors.RouterVisitor;

public class Main {
    public static void main(String[] args) {
        Router[] routers = new Router[]{
                new AsusRouter(),
                new EverestRouter(),
                new TpLinkRouter()
        };

        RouterVisitor macOsConfigurator = new MacOsConfigurator();

        for (int i = 0; i < routers.length; i++) {
            routers[i].accept(macOsConfigurator);
        }
    }
}
