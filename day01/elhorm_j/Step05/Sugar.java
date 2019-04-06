public class Sugar {

    private String name;
    private String type;
    private int calories;
    
    public Sugar(String name, String type, int calories) {
	this.name = name;
	this.type = type;
	this.calories = calories;
    }

    public String getName() {return this.name;}
    public String getType() {return this.type;}
    public int getCalories() {return this.calories;}

    public void setName(String name) {this.name = name;}
    public void setType(String type) {this.type = type;}
    public void setCalories(int calories) {this.calories = calories;}

    @Override
    public String toString() {
	String stock = "Sugar [name=" + this.name + ", type=" + this.type + ", calories=" + this.calories + "]";
	return stock;
    }
    
}
