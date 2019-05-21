package tr.edu.deu.ceng.coffie.entity.checkmethod;

import java.math.BigDecimal;

import tr.edu.deu.ceng.coffie.entity.exceptions.PayException;

public class CashCheckMethod implements CheckMethod {

	private BigDecimal customerCash;
	private BigDecimal moneyBack;
	public CashCheckMethod(BigDecimal cash) {
		customerCash = cash;
	}
	
	@Override
	public void check(BigDecimal amount) throws PayException {
		if(this.customerCash.compareTo(amount) == -1) {
			throw new PayException(amount);
		}
		this.moneyBack = this.customerCash.subtract(amount);
	}

	public BigDecimal getCustomerCash() {
		return customerCash;
	}

	public void setCustomerCash(BigDecimal customerCash) {
		this.customerCash = customerCash;
	}

	public BigDecimal getMoneyBack() {
		return moneyBack;
	}

	public void setMoneyBack(BigDecimal moneyBack) {
		this.moneyBack = moneyBack;
	}

	
}
