public class Katana extends Weapon {

    private int damagePoints; 

    public Katana(String name) {
	super(name, WeaponType.KATANA);
    }

    public int getDamagePoints() {return this.damagePoints;}
    public void setDamagepoints(int damagePoints) {this.damagePoints = damagePoints;}

    public void put(Player player) {
	player.getStats().increaseAttack(this.damagePoints);
    }

    public void remove(Player player) {
	player.getStats().decreaseAttack(this.damagePoints);
    }
}
