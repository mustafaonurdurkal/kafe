package tr.edu.deu.ceng.coffie.entity.recipe;

import java.math.BigDecimal;
import java.util.List;

import tr.edu.deu.ceng.coffie.entity.item.Item;

public class MultiItemRecipe implements Recipe{
	private String name;
	private List<Item> items;
	private List<Double> amount;
	private BigDecimal cost;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Item> getItems() {
		return items;
	}
	public void setItems(List<Item> items) {
		this.items = items;
	}
	public List<Double> getAmount() {
		return amount;
	}
	public void setAmount(List<Double> amount) {
		this.amount = amount;
	}
	public BigDecimal getCost() {
		return cost;
	}
	
}
