import javafx.beans.property.DoubleProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Person {

	private StringProperty firstName = new SimpleStringProperty();
	
	private StringProperty lastName = new SimpleStringProperty();
	
	private IntegerProperty age = new SimpleIntegerProperty();
	
	private DoubleProperty cgpa = new SimpleDoubleProperty();
	
	
	
	public StringProperty firstNameProperty() {
		return firstName;
	}
	
	public String getFirstName() {
		return firstName.get();
	}
	
	public void setFirstName(String firstName) {
		this.lastName.bind(this.firstName);
		this.firstName.set(firstName);
	}
	
	public StringProperty lastNameProperty() {
		return lastName;
	}
	
	public String getLastName() {
		return lastName.get();
	}
	
	public void setLastName(String lastName) {
		this.lastName.set(lastName);
	}
	
	public IntegerProperty ageProperty() {
		return age;
	}
	
	public int getAge() {
		return this.age.get();
	}
	
	public void setAge(int age) {
		this.age.set(age);
	}
	
	public DoubleProperty cgpaProperty() {
		return cgpa;
	}
	
	public double getCgpa() {
		return this.cgpa.get();
	}
	
	public void setCgpa(double cgpa) {
		this.cgpa.set(cgpa);
	}
	
	
	
}
