import java.util.*;

public class Player {

    private Stats stats;
    private Weapon weapon;
    private List<Item> bag;
    
    public Player(List items) {
	this.bag = items;
    }

    public Stats getStats() {return this.stats;}
    public void setStats(Stats stats) {this.stats = stats;}

    public Weapon getWeapon() {return this.weapon;}
    public void setWeapon(Weapon weapon) {this.weapon = weapon;}

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
	}
	this.bag.remove(weapon);
	this.setWeapon(weapon);
	weapon.put(this);
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

    public List getWeaponsByType(WeaponType type) {
	List<Weapon> weap = getWeapons();
	List rep = new ArrayList<>();

	for (Weapon w : weap)
	    if (w.getWeapon().equals(type))
		rep.add(w);
	return rep;
    }
}
