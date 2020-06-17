package com.hotelreservationsystem;

public class Customer {
	private Integer customerID;
	private String name;
	private TypeOfRoom type;
	private int startDay;
	private int duration;
	private Room room = null;

	public Customer() {
		this.name = null;
		this.type = null;
		this.startDay = 0;
		this.duration = 0;
	}

	public Customer(String name, TypeOfRoom type, int startDay, int duration) {
		this.name = name;
		this.type = type;
		this.startDay = startDay;
		this.duration = duration;
	}

	public TypeOfRoom getType() {
		return type;
	}

	public void setType(String type) {
		this.type = TypeOfRoom.valueOf(type.toUpperCase());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStartDay() {
		return startDay;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public void setStartDay(int startDay) {
		this.startDay = startDay;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public String toString() {
		if(room == null) {
			return "Name: " + name + "\nNo Reservation Made By This Customer" + "\nCustomer ID: "
					+ customerID;
		}
		else {
			return "Name: " + name + "\nDuration: " + duration + " days   Starting stay in: " + startDay + " days\n"
					+ this.room.toString() + "\nTotal Price: $" + (room.getPrice() * duration) + "\nCustomer ID: "
					+ customerID;
		}
	}

	public Integer getCustomerID() {
		return customerID;
	}

	public void setCustomerID(Integer customerID) {
		this.customerID = customerID;
	}

}
