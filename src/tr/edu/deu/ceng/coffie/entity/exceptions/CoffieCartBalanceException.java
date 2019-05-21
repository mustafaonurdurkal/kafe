package tr.edu.deu.ceng.coffie.entity.exceptions;

import java.math.BigDecimal;

import tr.edu.deu.ceng.coffie.entity.cart.CoffieCart;

public class CoffieCartBalanceException extends PayException{
	
	private static final long serialVersionUID = 5989036536883621831L;

	private CoffieCart cart;
	public CoffieCartBalanceException(CoffieCart cart,BigDecimal overAmount) {
		super(overAmount);
		this.cart = cart;
	}
	public CoffieCart getCart() {
		return cart;
	}
	public void setCart(CoffieCart cart) {
		this.cart = cart;
	}
	
	
}
