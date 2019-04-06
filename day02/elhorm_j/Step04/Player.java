public class Player {

    private String name;
    private int score;
    private HealthBar healthBar;

    public Player(String name, int point, HealthBar healthBar) {
	this.name = name;
	this.score = point;
	this.healthBar = healthBar;
    }

    public void addScore(int point) {
	this.score += point;
    }

    public void removeScore(int point) {
	this.score -= point;
    }

    public void resetScore() {
	this.score = 0;
    }

    public HealthBar getHealthBar() {return this.healthBar;}
    public String getName() {return this.name;}
    public int getScore() {return this.score;}


    public void setHealthBar(HealthBar healthBar) {this.healthBar = healthBar;}
    public void setScore(int score) {this.score = score;}
    public void setName(String name) {this.name = name;}
    
    public void attack(Player playerToAttack, int damage) {
	if (damage < 0)
	    return;
	playerToAttack.healthBar.setCurrentPoints(playerToAttack.healthBar.getCurrentPoints() - damage);
    }

    @Override
    public String toString() {
	return "Name : " + this.name + ", Point : " + this.score;
    }
}
