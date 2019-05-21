package tr.edu.deu.ceng.coffie.entity.menu.item;

import java.math.BigDecimal;

public interface MenuItem {
	String getName();
	BigDecimal getSalePrice();
	boolean isOuter();
}	
