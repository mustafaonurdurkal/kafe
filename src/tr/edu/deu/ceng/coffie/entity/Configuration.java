package tr.edu.deu.ceng.coffie.entity;

import java.util.HashMap;
import java.util.Map;

public class Configuration {
	private static Configuration configuration;
	private Map<String,Object> valueStore;
	
	private Configuration() {
		valueStore = new HashMap<String, Object>();
	}
	
	
	public static Configuration getInstance() {
		if(configuration == null)
			configuration = new Configuration();
		return configuration;
	}


	public Map<String, Object> getValueStore() {
		return valueStore;
	}


	public void setValueStore(Map<String, Object> valueStore) {
		this.valueStore = valueStore;
	}
	
	
}
