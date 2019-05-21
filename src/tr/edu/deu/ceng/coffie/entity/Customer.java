package tr.edu.deu.ceng.coffie.entity;

import java.time.LocalDate;

import tr.edu.deu.ceng.coffie.entity.cart.CoffieCart;
import tr.edu.deu.ceng.coffie.entity.cart.NoneCart;

public class Customer {
	private long id;
	private String name, surname, email, phone,adress;
	private LocalDate birthday;
	private CoffieCart cart;

	
	
	
	public Customer(long id, String name, String surname, String email, String phone, String adress, LocalDate birthday) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.email = email;
		this.phone = phone;
		this.adress = adress;
		this.birthday = birthday;
		this.cart= NoneCart.NONE;
	}

	public Customer() {
		// TODO Auto-generated constructor stub
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public LocalDate getBirthday() {
		return birthday;
	}

	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}

	public CoffieCart getCart() {
		return cart;
	}

	public void setCart(CoffieCart cart) {
		this.cart = cart;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

}
