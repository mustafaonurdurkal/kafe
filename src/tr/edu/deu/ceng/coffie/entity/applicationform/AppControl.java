package tr.edu.deu.ceng.coffie.entity.applicationform;

import java.math.BigDecimal;

import tr.edu.deu.ceng.coffie.entity.menu.item.ComplexMenuItem;
import tr.edu.deu.ceng.coffie.entity.menu.item.SingleMenuItem;
import tr.edu.deu.ceng.coffie.entity.recipe.SingleItemRecipe;

public class AppControl {

	public static void main(String[] args) {
		
		SingleItemRecipe singleItemRecipe= new SingleItemRecipe();
		singleItemRecipe.setName("Coca cola");
		SingleMenuItem singleMenuItem = new SingleMenuItem("Kola", singleItemRecipe, BigDecimal.valueOf(5),false);
		
		SingleItemRecipe burger= new SingleItemRecipe();
		burger.setName("Coca cola");
		
		SingleMenuItem singleMenuItem2 =  new SingleMenuItem("Burger", burger, BigDecimal.valueOf(5),false);
		
		ComplexMenuItem burgercolaMenuItem = new ComplexMenuItem(singleMenuItem2);
		ComplexMenuItem cola = new ComplexMenuItem(singleMenuItem);
		burgercolaMenuItem.setCombinedWith(cola);
		
		SingleItemRecipe singleItemRecipe3= new SingleItemRecipe();
		singleItemRecipe.setName("Patates");
		
		SingleMenuItem singleMenuItem3 = new SingleMenuItem("Patates", singleItemRecipe, BigDecimal.valueOf(5),false);
		ComplexMenuItem patates = new ComplexMenuItem(singleMenuItem3,"Ekonomik menu");
		
		cola.setCombinedWith(patates);
		
		System.out.println(burgercolaMenuItem.getName());
		System.out.println(patates.getMenuItem().getName());
		System.out.println(burgercolaMenuItem.getContent());
		
	}

}
