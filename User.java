package in.co.rays.crud;

public class User {
private int id= 0;
private String UserID= null;
private String Password = null;
private String FirstName = null;
private String LastName = null;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getUserID() {
	return UserID;
}
public void setUserID(String userID) {
	UserID = userID;
}
public String getPassword() {
	return Password;
}
public void setPassword(String password) {
	Password = password;
}
public String getFirstName() {
	return FirstName;
}
public void setFirstName(String firstName) {
	FirstName = firstName;
}
public String getLastName() {
	return LastName;
}
public void setLastName(String lastName) {
	LastName = lastName;
}



}
