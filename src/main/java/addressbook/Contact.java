package addressbook;
/**
 * 
 * @author Manolo
 * Nov 28, 2025
 */
public class Contact {
	/**
	 * Constructor used to create objects of this class and assign values 
	 * to this type of objects' fields
	 * @param name
	 * @param phoneNumber
	 * @param email
	 */
	public Contact(String name, String phoneNumber, String email) {
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.name = name;
	}
	//Attributes or fields of the class
	private String phoneNumber;
	private String name;
	private String surname;
	private String email;
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "name: " + name + " phone number: " + phoneNumber;
	}
}
