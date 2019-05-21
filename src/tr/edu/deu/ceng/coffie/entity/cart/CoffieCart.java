package tr.edu.deu.ceng.coffie.entity.cart;

import java.math.BigDecimal;

import tr.edu.deu.ceng.coffie.entity.Customer;
import tr.edu.deu.ceng.coffie.entity.exceptions.CoffieCartBalanceException;

public abstract class CoffieCart {
	protected BigDecimal balance;
	private Customer customer;
	private long id;
	
	
	
	public CoffieCart() {
		super();
		this.balance = BigDecimal.ZERO;
	}
	public CoffieCart(BigDecimal balance, Customer customer, long id) {
		super();
		this.balance = balance;
		this.customer = customer;
		this.id = id;
	}
	public BigDecimal getBalance() {
		return balance;
	}
	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	public abstract void pay(BigDecimal numberToPay) throws CoffieCartBalanceException;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	
}
