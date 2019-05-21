package tr.edu.deu.ceng.coffie.entity.item;

import java.math.BigDecimal;

public abstract class Item {
	private String name;
	private boolean froozeOnReady;
	private long amount;
	private BigDecimal price;
	private int id;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isFroozeOnReady() {
		return froozeOnReady;
	}

	public void setFroozeOnReady(boolean froozeOnReady) {
		this.froozeOnReady = froozeOnReady;
	}

	public long getAmount() {
		return amount;
	}

	public void setAmount(long amount) {
		this.amount = amount;
	}

	

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return name;
	}
	
}
