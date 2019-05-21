package tr.edu.deu.ceng.coffie.entity;

import java.time.LocalDateTime;

import tr.edu.deu.ceng.coffie.entity.checkmethod.CheckMethod;
import tr.edu.deu.ceng.coffie.entity.table.Table;

public class CheckOut {
	private Table table;
	private CheckMethod checkMethod;
	private LocalDateTime localDateTime;
	
	public Table getTable() {
		return table;
	}
	public void setTable(Table table) {
		this.table = table;
	}
	public CheckMethod getCheckMethod() {
		return checkMethod;
	}
	public void setCheckMethod(CheckMethod checkMethod) {
		this.checkMethod = checkMethod;
	}
	public LocalDateTime getLocalDateTime() {
		return localDateTime;
	}
	public void setLocalDateTime(LocalDateTime localDateTime) {
		this.localDateTime = localDateTime;
	}
	
	// to table check;
	public void check() {
		
	}

	
}
