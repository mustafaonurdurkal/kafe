package tr.edu.deu.ceng.coffie.entity.exceptions;

import java.math.BigDecimal;

public class PayException extends Exception {

	private static final long serialVersionUID = 1L;
	private BigDecimal overAmount;
	public PayException(BigDecimal overAmount) {
		this.overAmount = overAmount;
	}
	public BigDecimal getOverAmount() {
		return overAmount;
	}
	public void setOverAmount(BigDecimal overAmount) {
		this.overAmount = overAmount;
	}
	
	
}
