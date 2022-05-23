package goodpractice2.visitors;

import goodpractice2.routers.AsusRouter;
import goodpractice2.routers.EverestRouter;
import goodpractice2.routers.TpLinkRouter;

public interface RouterVisitor {
    void visit(AsusRouter router);
    void visit(EverestRouter router);
    void visit(TpLinkRouter router);
}
