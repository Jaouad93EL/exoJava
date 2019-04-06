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
	while (this.shapes[i] != null)
	    ++i;
	for (int j = 0; j < shapess.length; ++j) {
	    this.shapes[i] = shapess[j];
	    ++i;
	}
	    
    }    
}
