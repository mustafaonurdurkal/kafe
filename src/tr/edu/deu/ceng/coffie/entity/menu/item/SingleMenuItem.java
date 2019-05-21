package tr.edu.deu.ceng.coffie.entity.menu.item;

import java.math.BigDecimal;

import tr.edu.deu.ceng.coffie.entity.recipe.Recipe;

public class SingleMenuItem implements MenuItem {
	private String name;
	private Recipe recipe;
	private BigDecimal salePrice;
	private boolean outer;
	
	
	public SingleMenuItem(String name, Recipe recipe, BigDecimal salePrice, boolean outer) {
		super();
		this.name = name;
		this.recipe = recipe;
		this.salePrice = salePrice;
		this.outer = outer;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Recipe getRecipe() {
		return recipe;
	}
	public void setRecipe(Recipe recipe) {
		this.recipe = recipe;
	}
	public BigDecimal getSalePrice() {
		return salePrice;
	}
	public void setSalePrice(BigDecimal salePrice) {
		this.salePrice = salePrice;
	}
	@Override
	public boolean isOuter() {
		return outer;
	}
	
}
