public class Technician extends Worker{

    private byte rank;

    public Technician() {}
    
    public Technician(String name, int age, float salary, byte rank) {
	super(name, age, salary);
	this.rank = rank;
    }

    public int bonus() {
	if (this.rank >= 1 && this.rank <= 3)
	    return this.rank * 100;
	return 0;
    }

    public float calculateSalary() {
	return this.getSalary() + this.bonus();
    }

    @Override
    public String toString() {
	return super.toString() + "\t" + this.rank;
    }
}
