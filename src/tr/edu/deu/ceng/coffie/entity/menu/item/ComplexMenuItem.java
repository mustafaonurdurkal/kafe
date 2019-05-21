package tr.edu.deu.ceng.coffie.entity.menu.item;

import java.math.BigDecimal;

public class ComplexMenuItem implements MenuItem{

	private MenuItem menuItem;
	private ComplexMenuItem combinedWith;
	private String name;
	public ComplexMenuItem(MenuItem menuItem,String menuName) {
		this.menuItem = menuItem;
		this.name = menuName;
	}
	
	public ComplexMenuItem(MenuItem menuItem) {
		this.menuItem = menuItem;
	}
	
	public MenuItem getMenuItem() {
		return menuItem;
	}
	public void setMenuItem(MenuItem menuItem) {
		this.menuItem = menuItem;
	}
	public ComplexMenuItem getCombinedWith() {
		return combinedWith;
	}
	public void setCombinedWith(ComplexMenuItem combinedWith) {
		this.combinedWith = combinedWith;
	}


	@Override
	public String getName() {
		if(this.name == null){
			return combinedWith.getName();
		}
		return name;
	}
	
	public String getContent() {
		if(this.combinedWith == null)
			return this.getMenuItem().getName();
		return this.getMenuItem().getName()+" + "+this.getCombinedWith().getContent();
	}
	
	
	

	@Override
	public BigDecimal getSalePrice() {
		if(this.combinedWith == null)
			return this.getMenuItem().getSalePrice();
		return this.getMenuItem().getSalePrice().add(this.getCombinedWith().getSalePrice());
	}

	@Override
	public boolean isOuter() {
		if(this.combinedWith == null)
			return this.getMenuItem().isOuter();
		return this.getMenuItem().isOuter() || this.getCombinedWith().isOuter();
	}
	
	
	
	

}
