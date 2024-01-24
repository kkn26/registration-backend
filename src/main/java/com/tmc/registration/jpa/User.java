package com.tmc.registration.jpa;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
	
	private Integer id;
	private String classDuration;
	private String firstName; 
	private String lastName;
	private String gender;
	private String address;
	private String city;
	private String zip;
	private String state;
	private String phoneNumber;
	private String contactName;
	private String contactPhone; 
	private String contactRelationship;
	private String email;

	private String healthInformation;
    private String healthInsuranceCompany;
    private String pastAttendance;
    private String paymentType;
    private String paymentCode;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "first_name", nullable = false)
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	@Column(name = "last_name", nullable = false)
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	@Column(name = "city")
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}  

	@Column(name = "gender")
	public String getGender() {
		return gender;
	}

	public void setGender(String sex) {
		this.gender = sex;
	}

	@Column(name = "address")
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Column(name = "phone_number")
	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Column(name = "contact_name")
	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	} 
	@Column(name = "zip")
	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	@Column(name = "state")
	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Column(name = "contact_phone")
	public String getContactPhone() {
		return contactPhone;
	}

	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}

	@Column(name = "contact_relationship")
	public String getContactRelationship() {
		return contactRelationship;
	} 
	
	@Column(name = "calss_duration")
	public String getClassDuration() {
		return classDuration;
	}

	public void setClassDuration(String classDuration) {
		this.classDuration = classDuration;
	}

	public void setContactRelationship(String contactRelationship) {
		this.contactRelationship = contactRelationship;
	}

	@Column(name = "email")
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	@Column(name = "is_good_health")
	private boolean isGoodHealth; 
    public boolean isGoodHealth() {
		return isGoodHealth;
	}

	public void setGoodHealth(boolean isGoodHealth) {
		this.isGoodHealth = isGoodHealth;
	}

	@Column(name = "health_information")
	public String getHealthInformation() {
		return healthInformation;
	}

	public void setHealthInformation(String healthInformation) {
		this.healthInformation = healthInformation;
	}

	@Column(name = "health_insurance_company")
	public String getHealthInsuranceCompany() {
		return healthInsuranceCompany;
	}

	public void setHealthInsuranceCompany(String healthInsuranceCompany) {
		this.healthInsuranceCompany = healthInsuranceCompany;
	}

	@Column(name = "past_attendance")
	public String getPastAttendance() {
		return pastAttendance;
	}

	public void setPastAttendance(String pastAttendance) {
		this.pastAttendance = pastAttendance;
	}

	@Column(name = "payment_type")
	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	@Column(name = "payment_code")
	public String getPaymentCode() {
		return paymentCode;
	}

	public void setPaymentCode(String paymentCode) {
		this.paymentCode = paymentCode;
	}

}
