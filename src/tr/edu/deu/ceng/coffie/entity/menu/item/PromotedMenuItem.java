package tr.edu.deu.ceng.coffie.entity.menu.item;

import java.math.BigDecimal;

public class PromotedMenuItem implements MenuItem{
	private MenuItem menuItem;
	private double promotePercent;
	@Override
	public String getName() {
		return this.menuItem.getName();
	}
	@Override
	public BigDecimal getSalePrice() {
		BigDecimal currentPrice = this.menuItem.getSalePrice();
		return currentPrice.subtract(currentPrice.divide(new BigDecimal(promotePercent/100)));
	}
	@Override
	public boolean isOuter() {
		return menuItem.isOuter();
	}
	
}
