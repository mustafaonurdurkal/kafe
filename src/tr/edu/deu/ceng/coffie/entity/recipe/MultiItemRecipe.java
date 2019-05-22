package tr.edu.deu.ceng.coffie.entity.recipe;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import tr.edu.deu.ceng.coffie.entity.item.Item;

public class MultiItemRecipe implements Recipe{
	private String name,detail;
	private List<Item> items;
	private List<Double> amount;
	private long id;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	private BigDecimal cost;
	
	
	
	public MultiItemRecipe() {
		super();
		this.items = new ArrayList<>();
		this.amount = new ArrayList<>();
	}
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
		BigDecimal cost = BigDecimal.ZERO;
		for (int i = 0; i < items.size(); i++) {
			Item it = items.get(i);
			Double amount =this.amount.get(i);
			cost.add(BigDecimal.valueOf(it.getPrice().doubleValue()*amount));
		}
		return cost;
	}
	@Override
	public void addItem(Item item,double amount) {
		this.items.add(item);
		this.amount.add(amount);
	}
	@Override
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public String getDetail() {
		return detail;
	}
	
}
