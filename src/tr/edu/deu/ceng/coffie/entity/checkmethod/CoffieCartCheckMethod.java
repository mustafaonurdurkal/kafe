package tr.edu.deu.ceng.coffie.entity.checkmethod;

import java.math.BigDecimal;

import tr.edu.deu.ceng.coffie.entity.cart.CoffieCart;
import tr.edu.deu.ceng.coffie.entity.exceptions.PayException;

public class CoffieCartCheckMethod implements CheckMethod {

	private CoffieCart coffieCart;
	public CoffieCartCheckMethod(CoffieCart coffieCart) {
		this.coffieCart = coffieCart;
		
	}
	
	@Override
	public void check(BigDecimal amount) throws PayException {
		coffieCart.pay(amount);
	}
	
}
