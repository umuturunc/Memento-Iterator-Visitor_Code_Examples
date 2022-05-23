package goodpractice;

public interface RouterVisitor {
    void visit(AsusRouter router);
    void visit(EverestRouter router);
    void visit(TpLinkRouter router);
}
