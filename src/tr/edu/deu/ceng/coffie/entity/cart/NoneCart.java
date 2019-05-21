package tr.edu.deu.ceng.coffie.entity.cart;

import java.math.BigDecimal;

import tr.edu.deu.ceng.coffie.entity.exceptions.CoffieCartBalanceException;

public class NoneCart extends CoffieCart {

	public static NoneCart NONE = new NoneCart();
	
	private NoneCart() {}
	
	@Override
	public void pay(BigDecimal numberToPay) throws CoffieCartBalanceException {
		throw new NullPointerException();
	}

}
