package tr.edu.deu.ceng.coffie.entity.menu;

import java.util.List;

import tr.edu.deu.ceng.coffie.entity.menu.item.MenuItem;

public abstract class Menu {
	private String menuName;
	private List<MenuItem> items;
	public String getMenuName() {
		return menuName;
	}
	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}
	public List<MenuItem> getItems() {
		return items;
	}
	public void setItems(List<MenuItem> items) {
		this.items = items;
	}
	
}
