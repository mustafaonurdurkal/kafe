package tr.edu.deu.ceng.coffie.entity.store;

import java.util.List;

import tr.edu.deu.ceng.coffie.entity.item.ItemPackage;

public class IceBoxStore implements Store{
	private List<ItemPackage> packages;

	public List<ItemPackage> getPackages() {
		return packages;
	}

	public void setPackages(List<ItemPackage> packages) {
		this.packages = packages;
	}
	
}
