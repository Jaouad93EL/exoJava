public class Quadrilateral {

    private double length;
    private double width;
    
    public Quadrilateral(double length, double width) {
	this.length = length;
	this.width = width;
    }

    public double perimeter() {
	return (this.length + this.width) * 2;
    }

    public double area() {
	return this.length * this.width;
    }

    public boolean isSquare() {
	if (this.length == this.width)
	    return true;
	return false;
    }

    @Override
    public String toString() {
	String a = "";
	if (this.isSquare())
	    a += "It's a square";
	else
	    a += "It's not a square";
	String stock = "Length : " + this.length + " Width : " + this.width + " Perimeter : " + this.perimeter() + " Area : " + this.area() + " -> " + a;
	return stock;  
    }
}
