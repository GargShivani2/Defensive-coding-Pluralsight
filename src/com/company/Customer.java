package com.company;

public class Customer {

    private int customerId;
    public String emailAddress;
    private String firstName;
    public String lastName;

    public Customer()
    {

    }
    public Customer(int customerId) {
        this.customerId = customerId;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void validateEmail() {
    }
}
