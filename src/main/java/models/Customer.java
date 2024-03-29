package models;

public class Customer {
	private String id;
	private String name;
	private String gender;
	private String address;
	private String phone;
	private String email;
	private String password;
	private String imagepath;
	private String role;
	
	public Customer(String id, String name, String gender, String address, String phone, String email, String password, String imagepath, String role) {
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.address = address;
		this.phone = phone;
		this.email = email;
		this.password = password;
		this.imagepath = imagepath;
		this.role = role;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getImagepath() {
		return imagepath;
	}
	public void setImagepath(String imagepath) {
		this.imagepath = imagepath;
	}
	public String getRole() {
		return role;
	}
}
