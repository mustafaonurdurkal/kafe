package tr.edu.deu.ceng.coffie.entity.table;

import java.util.List;

import tr.edu.deu.ceng.coffie.entity.Order;
import tr.edu.deu.ceng.coffie.entity.exceptions.OrderNotValidException;

public abstract class Table {
	private int id;
	private int sitCount;
    private String name;
	protected List<Order> orders;


	public Table(int id, int sitCount, String name) {
		super();
		this.id = id;
		this.sitCount = sitCount;
		this.name = name;
	}

	public abstract void addOrder(Order order) throws OrderNotValidException;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSitCount() {
		return sitCount;
	}

	public void setSitCount(int sitCount) {
		this.sitCount = sitCount;
	}
	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
