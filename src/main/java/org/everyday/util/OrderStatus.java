package org.everyday.util;

public enum OrderStatus {

	IN_PROGRESS(1, "In Progress"), ORDER_RECIVED(2, "Service Recieved"), 
	OUT_FOR_DELIVERY(3, "Service Serve Soon"), DELIVERED(4, "Successfully Served"),CANCEL(5,"Cancelled"),SUCCESS(6,"Booked Successfully");

	private Integer id;

	private String name;

	private OrderStatus(Integer id, String name) {
		this.id = id;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
