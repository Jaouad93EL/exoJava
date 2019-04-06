import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.*;

public class Person {

    private String firstName;
    private String lastName;
    private LocalDate birthday;

    public Person(String firstName, String lastName) {
	this.firstName = firstName;
	this.lastName = lastName;
    }

    public String getFirstName() {return this.firstName;}
    public String getLastname() {return this.lastName;}
    public LocalDate getBirthday() {return this.birthday;}
    
    public void setFirstName(String firstName) {this.firstName = firstName;}
    public void setLastName(String lastName) {this.lastName = lastName;}
    public void setBirthday(String birthday) {
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
	this.birthday = LocalDate.parse(birthday, formatter);
    }

    public void showBirthday() {
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
	String l = this.birthday.format(formatter);
	System.out.println(l);
    }
}
