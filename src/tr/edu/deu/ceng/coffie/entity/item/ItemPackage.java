package tr.edu.deu.ceng.coffie.entity.item;

import java.time.LocalDateTime;

public class ItemPackage {
	private Item item;
	private double count;
	private LocalDateTime expirtyDate;
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
	public double getCount() {
		return count;
	}
	public void setCount(double count) {
		this.count = count;
	}
	public LocalDateTime getExpirtyDate() {
		return expirtyDate;
	}
	public void setExpirtyDate(LocalDateTime expirtyDate) {
		this.expirtyDate = expirtyDate;
	}
	
}
