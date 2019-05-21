package tr.edu.deu.ceng.coffie.entity.recipe;

import java.math.BigDecimal;

import tr.edu.deu.ceng.coffie.entity.item.Item;

public class SingleItemRecipe implements Recipe {
	private String name,detail;
	private Item item;
	private double amount;
	private BigDecimal cost;
	private long id;

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
		return item.getPrice().multiply(BigDecimal.valueOf(amount));
	}
	public void setCost(BigDecimal cost) {
		this.cost = cost;
	}
	@Override
	public void addItem(Item item,double amount) {
		if(this.item != null) {
			throw new IllegalArgumentException("Single recipe can't take more than one items");
		}
		this.item = item;
		this.amount =amount;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	
}
