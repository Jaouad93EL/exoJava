public class HealthBar extends Bar {

    private boolean isDead;

    public HealthBar(String name, int currentPoints, int maxPoint) {
	super(name, currentPoints, maxPoint);
	this.isDead = false;
    }

    @Override
    public void increaseCurrentPoints(int point) {
	if (this.isDead)
	    return;
	int i = 0;
	if (this.currentPoints < this.maxPoint) 
	    this.currentPoints += point;
    }

    @Override
    public void decreaseCurrentPoints(int point) {
	if (this.isDead)
	    return;
	this.currentPoints -= point;
	if (this.currentPoints < 0) {
	    this.isDead = true;
	    this.currentPoints = 0;
	}
    }

    @Override
    public void increaseMaxPoint(int point) {
	if (this.isDead)
	    return;
	this.maxPoint += point;
    }

    @Override
    public void decreaseMaxPoint(int point) {
	if (this.isDead)
	    return;
	this.maxPoint -= point;
    }
}
