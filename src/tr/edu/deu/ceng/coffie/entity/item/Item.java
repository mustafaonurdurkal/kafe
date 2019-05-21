package tr.edu.deu.ceng.coffie.entity.item;

public abstract class Item {
	private String name;
	private boolean froozeOnReady;
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
	
}
