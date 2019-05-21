package tr.edu.deu.ceng.coffie.entity.exceptions;

import tr.edu.deu.ceng.coffie.entity.Order;
import tr.edu.deu.ceng.coffie.entity.table.Table;

public class OrderNotValidException extends Exception {
	private static final long serialVersionUID = 1L;

	private Order order;
	private Table table;
	
	
	public OrderNotValidException(Order order, Table table) {
		super();
		this.order = order;
		this.table = table;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public Table getTable() {
		return table;
	}
	public void setTable(Table table) {
		this.table = table;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
