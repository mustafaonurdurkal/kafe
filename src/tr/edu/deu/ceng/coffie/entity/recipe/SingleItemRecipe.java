package tr.edu.deu.ceng.coffie.entity.recipe;

import java.math.BigDecimal;

import tr.edu.deu.ceng.coffie.entity.item.Item;

public class SingleItemRecipe implements Recipe {
	private String name;
	private Item item;
	private double amount;
	private BigDecimal cost;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public BigDecimal getCost() {
		return cost;
	}
	public void setCost(BigDecimal cost) {
		this.cost = cost;
	}
	
	
}
