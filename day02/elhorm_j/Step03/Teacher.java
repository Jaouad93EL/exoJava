public class Teacher extends Person {

    protected Specialization specialization;
    
    public Teacher(int id, String firstName, String lastName, String phone, String email, Specialization specialization) {
	super(id, firstName, lastName, phone, email);
	this.specialization = specialization;
    }

    public Specialization getSpecialization() {return this.specialization;}
    public void getSpecialization(Specialization specialization) {this.specialization = specialization;}

    @Override
    public String toString() {
	return "Teacher: " + this.firstName + " " + this.lastName + ". email: " + this.email + ", phone: " + this.phone;
    }
    
    @Override
    public boolean canGoToClass(Class c) {
	if (c.teacher == null || this == c.teacher)
	    return true;
	return false;
    }

    public void teacherOf(Class c) {
	System.out.println(this.toString());
	for (int i = 0; i < c.students.length; ++i) {
	    if (c.students[i] != null) {
		System.out.print("Student: " + c.students[i].getFirstName() + " ");
		System.out.print(c.students[i].getLastName() + ". ");
		System.out.print("email: " + c.students[i].getEmail());
		System.out.println(", phone: " + c.students[i].getPhone());
	    }
	}
	
	
    }
}
