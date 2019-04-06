public class Manager extends Employee {

    private String service;
    
    public Manager(int id, String firstname, String lastname, String mail, String phone, double salary, String service) {
	super(id, firstname, lastname, mail, phone, salary);
	this.service = service;
    }

    @Override
    public double getSalary() {
	return this.salary * 1.35;
    }

    public boolean superVisorOf(Team[] t, Developer d) {
	for (int i = 0; i < t.length; ++i) {
	    if (this.equals(t[i].getManager())) {
		for (int j = 0; j < t[i].getDevelopers().length; ++j) {
		    if (d.equals(t[i].getDevelopers()[j])) {
			return true;
		    }
		}
	    }
	}
	return false;
    }
}
