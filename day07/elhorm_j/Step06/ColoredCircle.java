public class ColoredCircle extends Circle implements Colorfull
{
    private String color;

    public String getColor() {return color;}
    public void setColor(String color) {this.color = color;}

    @Override
    public void draw() {
	System.out.println("I'm a " + color + " circle!");
    }
}
