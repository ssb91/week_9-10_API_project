package model;

import javax.persistence.Entity;

import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
@Table(name = "accountlist")

public class Account {
	
    public Account() {
        
    }

    @Autowired
    public Account(int id, String firstName, String lastName) {
        
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }
     
    private int id;
    private String firstName;
    private String lastName;
     
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
 
    @Override
    public String toString() {
        return "Account [id=" + id + ", firstName=" + firstName
                + ", lastName=" + lastName + "]";
    }
	
}
