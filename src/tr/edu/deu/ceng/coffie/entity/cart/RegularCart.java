package tr.edu.deu.ceng.coffie.entity.cart;

import java.math.BigDecimal;

import tr.edu.deu.ceng.coffie.entity.Configuration;
import tr.edu.deu.ceng.coffie.entity.exceptions.CoffieCartBalanceException;

public class RegularCart extends CoffieCart {
	
	private static final String REGULAR_CLAIM_COUNT_KEY= "regular_claim_count";
	private static final String REGULAR_CLAIM_FREE_MAX_KEY = "regular_claim_free_max";
	
	int claim; // Regular cart users has free shopping when it reaces the price count.
	
	
	@Override
	public void pay(BigDecimal amountToPay) throws CoffieCartBalanceException {
		int claimCount = (int) Configuration.getInstance().getValueStore().get(REGULAR_CLAIM_COUNT_KEY);
		if(claim  == claimCount) {
			int claimMax = (int) Configuration.getInstance().getValueStore().get(REGULAR_CLAIM_FREE_MAX_KEY);
			if(amountToPay.intValue() > claimMax) {
				amountToPay = amountToPay.subtract(new BigDecimal(claimMax));
				if(balance.subtract(amountToPay).intValue() > 0) {
					balance = balance.subtract(amountToPay);
				}else {
					throw new CoffieCartBalanceException(this, amountToPay);
				}
			}
			claim = 0;
		}else {
			if(balance.subtract(amountToPay).intValue() > 0) {
				balance = balance.subtract(amountToPay);
				claim++;
			}else {
				throw new CoffieCartBalanceException(this, amountToPay);
			}
		}
	}


	

	public int getClaim() {
		return claim;
	}


	public void setClaim(int claim) {
		this.claim = claim;
	}

	
}
