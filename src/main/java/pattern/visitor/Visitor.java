package pattern.visitor;

import pattern.visitor.shapes.Circle;
import pattern.visitor.shapes.CompoundShape;
import pattern.visitor.shapes.Dot;
import pattern.visitor.shapes.Rectangle;

public interface Visitor {
    String visitDot(Dot dot);

    String visitCircle(Circle circle);

    String visitRectangle(Rectangle rectangle);

    String visitCompoundGraphic(CompoundShape cg);
}
