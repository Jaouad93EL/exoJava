public abstract class Bar {

    protected String name;
    protected int currentPoints;
    protected int maxPoint;
    
    public Bar(String name, int currentPoints, int maxPoint) {
	this.name = name;
	this.currentPoints = currentPoints;
	this.maxPoint = maxPoint;
    }

    public void setName(String name) {this.name = name;}
    public void setCurrentPoints(int currentPoints) {this.currentPoints = currentPoints;}
    public void setMaxPoint(int MaxPoint) {this.maxPoint = maxPoint;}

    public String getName() {return this.name;}
    public int getCurrentPoints() {return this.currentPoints;}
    public int getMaxPoint() {return this.maxPoint;}

    public abstract void increaseCurrentPoints(int point);
    public abstract void decreaseCurrentPoints(int point);
    public abstract void increaseMaxPoint(int point);
    public abstract void decreaseMaxPoint(int point);
}
