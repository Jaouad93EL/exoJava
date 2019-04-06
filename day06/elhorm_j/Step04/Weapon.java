public abstract class Weapon implements Item {

    protected WeaponType weapon;
    protected String name;

    public Weapon(String name, WeaponType weapon) {
	this.weapon = weapon;
	this.name = name;
    }

    public WeaponType getWeapon() {return this.weapon;}
    public void setWeapon(WeaponType weapon) {this.weapon = weapon;}

    public String getName() {return this.name;}
    public void setName(String name) {this.name = name;}

    public void put(Player player) {}
    public void remove(Player player) {}
    
}
