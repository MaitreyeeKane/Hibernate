package co.rays.crud;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="User")
public class User {
@Id
@GeneratedValue(generator="increment")
@GenericGenerator(name="increment",strategy="increment")
@Column(name="ID")
private int id;
@Column(name="FNAME")
private String Fname;
@Column(name="LNAME")
private String Lname;
@Column(name="USERNAME")
private String UserName;
@Column(name="pwd")
private String pwd;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFname() {
	return Fname;
}
public void setFname(String fname) {
	Fname = fname;
}
public String getLname() {
	return Lname;
}
public void setLname(String lname) {
	Lname = lname;
}
public String getUserName() {
	return UserName;
}
public void setUserName(String userName) {
	UserName = userName;
}
public String getPwd() {
	return pwd;
}
public void setPwd(String pwd) {
	this.pwd = pwd;
}

}
