public abstract class  Mammal implements Animal {

    protected String name;
    protected float weight;

    public Mammal(String name, float weight) {
	this.name = name;
	this.weight = weight;
    }

    public String getName() {return this.name;}
    public float getWeight() {return this.weight;}

    public abstract void say();
    public abstract void run();
}
