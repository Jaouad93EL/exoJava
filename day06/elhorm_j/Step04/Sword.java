public class Sword extends Weapon {

    private Stats stats;

    public Sword(String name) {
	super(name, WeaponType.SWORD);
    }
 
    public Stats getStats() {return this.stats;}
    public void setStats(Stats stats) {this.stats = stats;}
    
    public void put(Player player) {
	player.getStats().increaseAttack(stats.getAttack());
	player.getStats().increaseDefence(stats.getDefence());
    }

    public void remove(Player player) {
	player.getStats().decreaseAttack(stats.getAttack());
	player.getStats().decreaseDefence(stats.getDefence());
    }
}
