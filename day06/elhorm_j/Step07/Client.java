import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.*;

public class Client extends Person{

    private String id;
    private LocalDate registrationDate;
    
    public Client(String firstName, String lastName, String registrationDate) {
	super(firstName, lastName);
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
	this.registrationDate = LocalDate.parse(registrationDate, formatter);
    }

    public String getId() {return this.id;}
    public LocalDate getRegistrationDate() {return this.registrationDate;}
    
    public void setId(String id) {this.id = id;}
    public void setRegistrationDate(String registrationDate) {
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
	this.registrationDate = LocalDate.parse(registrationDate, formatter);
    }    
}
