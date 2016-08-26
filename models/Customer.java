package models;
import java.util.Date;
import java.util.GregorianCalendar;

import utilities.GenderType;

public class Customer {
	private String title;
	private String firstName;
	private String surname;
	private String address;
	private String phoneNumber;
	private String email;
	private int customerNumber;
	private GenderType gender;
	private boolean isvalid;
	private Date expiryDate;
	
	public Customer(String title, String firstName, String surname, String address, String phoneNumber, String email, int customerNumber, GenderType gender) {
		this.setName(title, firstName, surname);
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.customerNumber = customerNumber;
		this.gender = gender;
		this.isvalid = true;
		
		GregorianCalendar gcal = new GregorianCalendar();
		gcal.add(GregorianCalendar.YEAR, 1);
		this.expiryDate = gcal.getTime();
	}
	
	public String getFirstName() {
		return firstName;
	}

	public String getSurname() {
		return surname;
	}
	
	public String getMailingName() {
		StringBuilder sb = new StringBuilder(this.title);
		sb.append(" ");
		sb.append(this.firstName.substring(0, 1));
		sb.append(" ");
		sb.append(this.surname);
		return sb.toString();
	}
	
	public void setName(String title, String firstName, String surname) {
		this.title = title; // need to use `this.` to reference the private member `title` 
		this.firstName = firstName; 
		this.surname = surname;
	}
	
	public GenderType getGender() {
		return this.gender;
	}
	
	public Date getExpiryDate() {
		return this.expiryDate;
	}
}
