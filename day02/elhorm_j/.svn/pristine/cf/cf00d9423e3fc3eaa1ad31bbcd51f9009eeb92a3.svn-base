public class Developer extends Employee {

    private String specialization;

    public Developer(int id, String firstname, String lastname, String mail, String phone, double salary, String specialization) {
	super(id, firstname, lastname, mail, phone, salary);
	this.specialization = specialization;
    }
	
    public void setSpecialization(String specialization) {this.specialization = specialization;}
    public String getSpecialization() {return this.specialization;}

    @Override
    public double getSalary() {
	return this.salary * 1.2;
    }
}
