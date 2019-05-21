package tr.edu.deu.ceng.coffie.entity.cart;

import java.math.BigDecimal;
import java.time.LocalDate;

import tr.edu.deu.ceng.coffie.entity.Configuration;
import tr.edu.deu.ceng.coffie.entity.exceptions.CoffieCartBalanceException;

public class PremiumCart extends CoffieCart {
	// This variables keys for map where configuration class.
	private static final String PREMIUM_MOUNT_PRICE = "premium_mount_price";
	private static final String PREMIUM_PAY_PERCENT = "premium_pay_percent";
	private static final String PREMIUM_CLAIM_COUNT = "premium_claim_count";
	
	// premium customers has payment every mounth.
	private LocalDate lastMoneyCheck;
	// premium customers has claims where they earn to use when they be paid on mounth started.
	// total claim will be setted on Configration class.
	private int claim;
	
	public LocalDate getLastMoneyCheck() {
		return lastMoneyCheck;
	}
	public void setLastMoneyCheck(LocalDate lastMoneyCheck) {
		this.lastMoneyCheck = lastMoneyCheck;
	}
	
	@Override
	public void pay(BigDecimal numberToPay) throws CoffieCartBalanceException {
		if(claim > 0) { // IF there is premium claim use it
			// Using claim changes numberToPay. Makes cheaper.
			//Get percent from configuration 
			Integer percent = (Integer) Configuration.getInstance().getValueStore().get(PREMIUM_PAY_PERCENT);
			BigDecimal perc = new BigDecimal(percent/100);
			BigDecimal afterPayment = numberToPay.multiply(perc);
			if(balance.subtract(afterPayment).intValue() > 0) { //upgrade balance
				this.balance = balance.subtract(afterPayment);
				claim--;
			}else {
				throw new CoffieCartBalanceException(this, numberToPay);
			}
		}else { // Direct pay the money
			if(balance.subtract(numberToPay).intValue() > 0) {
				this.balance = balance.subtract(numberToPay);
			}else {
				throw new CoffieCartBalanceException(this, numberToPay);
			}
		}
	}
	public int getClaim() {
		return claim;
	}
	public void setClaim(int claim) {
		this.claim = claim;
	}
	
	public void makeMounthlyPayment() throws CoffieCartBalanceException {
		Integer price = (Integer) Configuration.getInstance().getValueStore().get(PREMIUM_MOUNT_PRICE);    
		if(balance.subtract(new BigDecimal(price)).intValue() > 0) {                                           //pay mountly payment
			this.balance = balance.subtract(new BigDecimal(price));
			Integer claimCount = (Integer) Configuration.getInstance().getValueStore().get(PREMIUM_CLAIM_COUNT); //upgdage claim
			claim = claimCount;
		}else {
			throw new CoffieCartBalanceException(this, new BigDecimal (price));
		}
	}
	
	
}
