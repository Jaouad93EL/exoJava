import java.util.*;

public class Player {

    private Stats stats;
    private Weapon weapon;
    private List<Item> bag;
    private int maxHealthPoints;
    private int currentHealthPoints;
    
    public Player(List items) {
	this.bag = items;
    }    
    public Player(List items, int maxHealthPoints) {
	this.bag = items;
	this.maxHealthPoints = maxHealthPoints;
    }

    public Stats getStats() {return this.stats;}
    public void setStats(Stats stats) {this.stats = stats;}

    public Weapon getWeapon() {return this.weapon;}
    public void setWeapon(Weapon weapon) {this.weapon = weapon;}

    public int getMaxHealthPoints() {return this.maxHealthPoints;}
    public int getCurrentHealthPoints() {return this.currentHealthPoints;}

    public void setMaxHealthPoints(int maxHealthPoints) {this.maxHealthPoints = maxHealthPoints;}
    public void setCurrentHealthPoints(int currentHealthPoints) {this.currentHealthPoints = currentHealthPoints;}
    public void removeWeapon() {
       	if (weapon != null)
	    weapon.remove(this);
	if (!this.bag.contains(this.weapon))
	    this.bag.add(this.weapon);
	this.weapon = null;
    }

    public void putWeapon(Weapon weapon) {
	if (weapon != null) {
      	    this.removeWeapon();
	    this.bag.remove(weapon);
	    this.setWeapon(weapon);
	    weapon.put(this);
	}
    }

    public void addItem(Item item) {
	this.bag.add(item);
    }

    public List<Weapon> getWeapons() {
	List<Weapon> weap = new ArrayList<>();

	for (Item i : this.bag)
	    if (i instanceof Weapon)
		weap.add((Weapon)i);
	return weap;
    }

    public void takeDamage(int damagePoints) {
	if (damagePoints > 0)
	    for (int i = 0; i < damagePoints; ++i)
		if (this.currentHealthPoints > 0)
		    this.currentHealthPoints--;
    }

    public void heal(int healthPoints) {
	if (healthPoints > 0)
	    for (int i = 0; i < healthPoints; ++i)
		if (this.currentHealthPoints < this.maxHealthPoints)
		    this.currentHealthPoints++;
    }

    public List getWeaponsByType(WeaponType type) {
	List<Weapon> weap = getWeapons();
	List rep = new ArrayList<>();

	for (Weapon w : weap)
	    if (w.getWeapon().equals(type))
		rep.add(w);
	return rep;
    }
}
