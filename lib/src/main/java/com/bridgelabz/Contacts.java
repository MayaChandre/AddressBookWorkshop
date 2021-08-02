package com.bridgelabz;

import java.util.Objects;

public class Contacts {

	String firstName;
    String lastName;
    String city;
    String state;
    int zip;
    int phoneNumber;
    String email;

    //Constructor to initialize global variables
   
    public Contacts(String firstName, String lastName, String city, String state, int zip, int mob, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phoneNumber = mob;
        this.email = email;
    }

    public Contacts(String firstName2, String lastName2, String address, String state2, String city2, int zipCode,
			long number, String email2) {
		// TODO Auto-generated constructor stub
	}

	public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contacts contact = (Contacts) o;
        return zip == contact.zip && phoneNumber == contact.phoneNumber && Objects.equals(firstName, contact.firstName) && Objects.equals(lastName, contact.lastName) && Objects.equals(city, contact.city) && Objects.equals(state, contact.state) && Objects.equals(email, contact.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, city, state, zip, phoneNumber, email);
    }
}
