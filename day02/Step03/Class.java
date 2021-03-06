public class Class {

    int classRoomNumber;
    Teacher teacher;
    Student[] students;

    public Class() {}
    
    public Class(Teacher teacher, int numberOfStudents, int classRoomNumber) {
      	this.classRoomNumber = classRoomNumber;
	this.teacher = teacher;
	this.students = new Student[numberOfStudents];
    }

    public int countStudents() {
	return this.students.length;
    }

    public boolean isFull() {
	for (int i = 0; i < this.students.length; ++i)
	    if (this.students[i] == null)
		return false;
	return true;
    }

    public boolean hasTeacher() {
	if (this.teacher == null)
	    return false;
	return true;
    }

    public boolean addStudent(Student s) {
	int i = 0;
	
	while (i < this.students.length) {
	    if (this.students[i] == null)
		break;
	    ++i;
	}
	if (i == this.students.length)
	    return false;
	this.students[i] = s;
	return true;
    }
}
