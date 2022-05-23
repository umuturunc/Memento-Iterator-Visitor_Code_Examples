package goodpractice;

//Somut visitor sınıfı
public class LinuxConfigurator implements RouterVisitor {
    @Override
    public void visit(AsusRouter router) {
        System.out.println("Asus Router için linux ayarları tamamlandı");
    }

    @Override
    public void visit(EverestRouter router) {
        System.out.println("Everest Router için linux ayarları tamamlandı");
    }

    @Override
    public void visit(TpLinkRouter router) {
        System.out.println("TpLink Router için linux ayarları tamamlandı");
    }
}
