public class Student extends Person {

    public Student(int id, String firstName, String lastName, String phone, String email) {
	super(id, firstName, lastName, phone, email);
    }

    @Override
    public String toString() {
	return "Student: " + this.firstName + " " + this.lastName + ". email: " + this.email + ", phone: " + this.phone;
    }

    public boolean canGoToClass(Class c) {
	for (int i = 0; i < c.students.length; ++i)
	    if (c.students[i] == null)
		return true;
	return false;
    }

}
