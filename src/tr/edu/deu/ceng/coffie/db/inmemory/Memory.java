package tr.edu.deu.ceng.coffie.db.inmemory;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import tr.edu.deu.ceng.coffie.entity.Customer;
import tr.edu.deu.ceng.coffie.entity.auth.Loginnable;
import tr.edu.deu.ceng.coffie.entity.auth.SimpleLoginer;
import tr.edu.deu.ceng.coffie.entity.cart.CoffieCart;
import tr.edu.deu.ceng.coffie.entity.cart.StudentCart;
import tr.edu.deu.ceng.coffie.entity.item.CountableItem;
import tr.edu.deu.ceng.coffie.entity.item.Item;
import tr.edu.deu.ceng.coffie.entity.item.UnCountableItem;
import tr.edu.deu.ceng.coffie.entity.recipe.Recipe;
import tr.edu.deu.ceng.coffie.entity.recipe.SingleItemRecipe;
import tr.edu.deu.ceng.coffie.entity.table.InnerTable;
import tr.edu.deu.ceng.coffie.entity.table.OutTable;
import tr.edu.deu.ceng.coffie.entity.table.Table;

public class Memory {
	private Map<String,Loginnable > loginInfo;
	private List<Table> tables;
	private List<CoffieCart> carts;
	private List<Customer> customers;
	private List<Item> items;
	private List<Recipe> recipes;
	private Loginnable activeLogin;

	
	private Memory() {
		this.loginInfo = new HashMap<>();
		loadData();
		tables = new ArrayList<>();
		loadTableData();
		carts = new ArrayList<>();
		customers = new ArrayList<>();
		loadCartAndCustomerData();
		items = new ArrayList<>();
		loadItemDatas();
		this.recipes = new ArrayList<>();
		loadRecipes();
	}
	




	private void loadRecipes() {
		Random rnd = new Random();
		for(int i=0;i<40;i++) {
			Recipe rc = new SingleItemRecipe();
			rc.setId(i);
			rc.setName("Recipe "+i);
			rc.addItem(items.get(0), rnd.nextInt(1000));
			recipes.add(rc);
		}
	}





	private void loadItemDatas() {
		Random rnd = new Random();
		for(int i=0;i<50;i++) {
			Item item = new CountableItem();
			item.setId(i);
			item.setName("Store Item "+i);
			item.setAmount(rnd.nextInt(100000));
			item.setPrice(BigDecimal.valueOf(rnd.nextInt(1000)));
			item.setFroozeOnReady(false);
			items.add(item);
		}
		for(int i=0;i<50;i++) {
			Item item = new UnCountableItem();
			item.setId(i);
			item.setName("UnStore Item "+i);
			item.setAmount(rnd.nextInt(100000));
			item.setPrice(BigDecimal.valueOf(rnd.nextInt(1000)));
			item.setFroozeOnReady(false);
			items.add(item);
		}
	}





	private void loadCartAndCustomerData() {
			Customer customer = new Customer(0,"dogu","han","","","",LocalDate.now());
			customer.setName("dogukan");
			customer.setEmail("test");
			customers.add(customer);
		    StudentCart st = new StudentCart();
					st.setCustomer(customer);
					customer.setCart(st);
					carts.add(st);
			customer = new Customer(1,"dogu2","han","","","",LocalDate.now());
			customer.setName("dogukan");
			customer.setEmail("test");
			customers.add(customer);
			 st = new StudentCart();
				st.setCustomer(customer);
				customer.setCart(st);
				carts.add(st);
				
				customer = new Customer(2,"doguemp","han","","","",LocalDate.now());
				customer.setName("dogukan");
				customer.setEmail("test");
				customers.add(customer);
		
	}



	private void loadData(){
		SimpleLoginer admin = new SimpleLoginer("admin", "1234");
		loginInfo.put(admin.getEmail(),admin);
	}
	
	private void loadTableData() {
		for(int i=0;i<30;i++) {
			Table t1 = new InnerTable(i, 4, "A"+(i+1));
			Table t2 = new OutTable(i, 4,"C"+(i+1));
			tables.add(t1);tables.add(t2);
		}
	}
	private static Memory instance;
	
	public static Memory getMemory() {
		if(instance == null) {
			instance = new Memory();
		}
		return instance;
	}

	public Map<String, Loginnable> getLoginInfo() {
		return loginInfo;
	}

	public void setLoginInfo(Map<String, Loginnable> loginInfo) {
		this.loginInfo = loginInfo;
	}

	public Loginnable getActiveLogin() {
		return activeLogin;
	}

	public void setActiveLogin(Loginnable activeLogin) {
		this.activeLogin = activeLogin;
	}



	public List<Table> getTables() {
		return tables;
	}



	public void setTables(List<Table> tables) {
		this.tables = tables;
	}



	public List<CoffieCart> getCarts() {
		return carts;
	}



	public void setCarts(List<CoffieCart> carts) {
		this.carts = carts;
	}





	public List<Customer> getCustomers() {
		return customers;
	}





	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}





	public List<Item> getItems() {
		return items;
	}





	public void setItems(List<Item> items) {
		this.items = items;
	}





	public List<Recipe> getRecipes() {
		return recipes;
	}





	public void setRecipes(List<Recipe> recipes) {
		this.recipes = recipes;
	}


	

	
	
	
	
	
}
