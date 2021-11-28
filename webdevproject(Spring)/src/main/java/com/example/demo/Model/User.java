package com.example.demo.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employeetable")
public class User {
@Id
private int employeeid;
private String username;
private String firstname;
private String lastname;
private String password;
private int age;
private String city;

public User() {

}
public User(int employeeid, String username, String firstname, String lastname, String password, int age, String city) {
super();
this.employeeid = employeeid;
this.username = username;
this.firstname = firstname;
this.lastname = lastname;
this.password=password;
this.age = age;
this.city = city;
}
public int getEmployeeid() {
return employeeid;
}
public void setEmployeeid(int employeeid) {
this.employeeid = employeeid;
}
public String getUsername() {
return username;
}
public void setUsername(String username) {
this.username = username;
}
public String getFirstname() {
return firstname;
}
public void setFirstname(String firstname) {
this.firstname = firstname;
}
public String getLastname() {
return lastname;
}
public void setLastname(String lastname) {
this.lastname = lastname;
}

public String getPassword() {
return password;
}
public void setPassword(String password) {
this.password = password;
}
public int getAge() {
return age;
}
public void setAge(int age) {
this.age = age;
}
public String getCity() {
return city;
}
public void setCity(String city) {
this.city = city;
}





}