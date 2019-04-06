public abstract class Employee {

    protected int id;
    protected double salary;
    protected String firstname;
    protected String lastname;
    protected String mail;
    protected String phone;

    public Employee(int id, String firstname, String lastname, String mail, String phone, double salary) {
	this.id = id;
	this.firstname = firstname;
	this.lastname = lastname;
	this.mail = mail;
	this.phone = phone;
	this.salary = salary;
    }
	

    public void setId(int id) {this.id = id;}
    public void setFirstname(String firstname) {this.firstname = firstname;}
    public void setLastname(String lastname) {this.lastname = lastname;}
    public void setMail(String mail) {this.mail = mail;}
    public void setPhone(String phone) {this.phone = phone;}

    public int getId() {return this.id;}
    public String getFirstname() {return this.firstname;}
    public String getLastname() {return this.lastname;}
    public String getMail() {return this.mail;}
    public String getPhone() {return this.phone;}

    public abstract double getSalary();
}
