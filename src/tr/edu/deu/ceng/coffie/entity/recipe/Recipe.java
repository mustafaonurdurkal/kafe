package tr.edu.deu.ceng.coffie.entity.recipe;

import java.math.BigDecimal;

import tr.edu.deu.ceng.coffie.entity.item.Item;

public interface Recipe {
	BigDecimal getCost();
	void addItem(Item item,double amount);
	void setName(String name);
	String getName();
	String getDetail();
	void setDetail(String detail);
	void setId(long id);
	long getId();
}
