public class Worker {

    private String name;
    private int age;
    private float salary;

    public Worker() {}
    
    public Worker(String name, int age, float salary) {
	this.name = name;
	this.age = age;
	this.salary = salary;
    }

    public Worker(Worker w) {
	this.name = w.name;
	this.age = w.age;
	this.salary = w.salary;
    }

    public void setName(String name) {this.name = name;}
    public void setAge(int age) {this.age = age;}
    public void setSalary(float salary) {this.salary = salary;}

    public String getName() {return this.name;}
    public int getAge() {return this.age;}
    public float getSalary() {return this.salary;}

    @Override
    public String toString() {
	return this.name + "\t" + this.age + "\t" + this.salary;
    }

    public void show() {
	System.out.println(this.toString());
    }

    public void payRise(float a) {
	this.salary += a;
    }

}
