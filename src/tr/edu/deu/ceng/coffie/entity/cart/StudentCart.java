package tr.edu.deu.ceng.coffie.entity.cart;

import java.math.BigDecimal;

import tr.edu.deu.ceng.coffie.entity.Configuration;
import tr.edu.deu.ceng.coffie.entity.exceptions.CoffieCartBalanceException;

public class StudentCart extends CoffieCart {

	private static final String STUDENT_CLAIM_PERCENT_KEY = "student_claim_percet";


	@Override
	public void pay(BigDecimal numberToPay) throws CoffieCartBalanceException {
		int percent = (Integer) Configuration.getInstance().getValueStore().get(STUDENT_CLAIM_PERCENT_KEY);
		BigDecimal perc = new BigDecimal(percent / 100);
		BigDecimal afterPayment = numberToPay.multiply(perc);
		if (balance.subtract(afterPayment).intValue() > 0) {
			this.balance = balance.subtract(afterPayment);
		} else {
			throw new CoffieCartBalanceException(this, numberToPay);
		}
	}



}
