package tr.edu.deu.ceng.coffie.entity;

import tr.edu.deu.ceng.coffie.entity.menu.item.MenuItem;
import tr.edu.deu.ceng.coffie.entity.table.Table;

public class Order {
	private Table table;
	private MenuItem menuItem;
	public Table getTable() {
		return table;
	}
	public void setTable(Table table) {
		this.table = table;
	}
	public MenuItem getMenuItem() {
		return menuItem;
	}
	public void setMenuItem(MenuItem menuItem) {
		this.menuItem = menuItem;
	}	
}
