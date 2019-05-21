package tr.edu.deu.ceng.coffie.entity.table;

import tr.edu.deu.ceng.coffie.entity.Order;

public class OutTable extends Table{


	public OutTable(int id, int sitCount, String name) {
		super(id, sitCount, name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void addOrder(Order order) {
		this.orders.add(order);
	}

}
