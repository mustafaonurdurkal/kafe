package tr.edu.deu.ceng.coffie.entity.cart;

import java.math.BigDecimal;

import tr.edu.deu.ceng.coffie.entity.Customer;
import tr.edu.deu.ceng.coffie.entity.exceptions.CoffieCartBalanceException;

public abstract class CoffieCart {
	protected BigDecimal balance;
	private Customer customer;

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
	
	
}
