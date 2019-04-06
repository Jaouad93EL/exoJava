public class Desk {

    private Shape[] shapes;

    public Desk() {
	this.shapes = new Shape[1000];
    }

    public void draw() {
	for (int  i = 0; i < this.shapes.length; ++i)
	    if (this.shapes[i] != null)
		this.shapes[i].draw();
    }

    public void addShape(Shape shape) {
	for (int i = 0; i < this.shapes.length; ++i)
	    if (this.shapes[i] == null) {
		this.shapes[i] = shape;
		return;
	    }
    }
    public void addShapes(Shape[] shapess) {
	int i = 0;
	while (i < this.shapes.length) {
	    if (this.shapes[i] == null)
		break;
	    ++i;
	}
	int j = 0;
	while (j < shapess.length) {
	    this.shapes[i] = shapess[j];
	    ++i;
	    ++j;
	}
    }

    public void drawRectangles() {
	for (int i = 0; i < this.shapes.length; ++i)
	    if (this.shapes[i] instanceof Rectangle)
	        this.shapes[i].draw();
    }

    public void drawCircles() {
	for (int i = 0; i < this.shapes.length; ++i)
	    if (this.shapes[i] instanceof Circle)
	        this.shapes[i].draw();
    }
}
