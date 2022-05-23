package goodpractice;

public class Main {
    public static void main(String[] args) {
        Router[] routers = new Router[]{
                new AsusRouter(),
                new EverestRouter(),
                new TpLinkRouter()
        };

        RouterVisitor linuxConfigurator = new LinuxConfigurator();

        for (int i = 0; i < routers.length; i++) {
            routers[i].accept(linuxConfigurator);
        }
    }
}
