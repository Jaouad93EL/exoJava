import java.util.*;

public class DeskImpl<T extends Shape> {
    
    private List<T> shapes;

    public DeskImpl() {
	this.shapes = new ArrayList<T>();
    }

    public void addShape(T shape) {
	    this.shapes.add(shape);
    }

    public void drawShapes() {
	for (T s : this.shapes)
	    s.draw();
    }
}
