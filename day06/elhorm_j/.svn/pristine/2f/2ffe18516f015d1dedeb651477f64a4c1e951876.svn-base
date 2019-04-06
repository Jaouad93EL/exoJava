public class Shield extends Weapon {

    private int defence;

    public Shield(String name) {
	super(name, WeaponType.SHIELD);
    }

    public int getDefence() {return this.defence;}
    public void setDefence(int defence) {this.defence = defence;}

    public void put(Player player) {
	player.getStats().increaseDefence(this.defence);
    }
    
    public void remove(Player player) {
	player.getStats().decreaseDefence(this.defence);
    }
}
