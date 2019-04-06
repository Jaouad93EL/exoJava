
public class Elephant extends Mammal {

    public Elephant(String name, float weight) {
	super(name, weight);
    }

    @Override
    public void say() {
	System.out.println(String.format("%,.2f", weight).replace(".",","));
        System.out.println(this.name + " say : I'm BIG and HEAVY! (weight : " + this.weight + ")");
    }
}
