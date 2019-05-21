package tr.edu.deu.ceng.coffie.entity.checkmethod;

import java.math.BigDecimal;

import tr.edu.deu.ceng.coffie.entity.exceptions.PayException;

public class CreditCartCheckMethod implements CheckMethod{

	private String cartNumber;
	public CreditCartCheckMethod(String cartNumber) {
		this.cartNumber = cartNumber;
	}
	
	@Override
	public void check(BigDecimal amount) throws PayException {
		// do bank work
	}

	public String getCartNumber() {
		return cartNumber;
	}

	public void setCartNumber(String cartNumber) {
		this.cartNumber = cartNumber;
	}
	
	
}
