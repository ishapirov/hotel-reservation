package com.hotelreservationsystem;

public class Double extends Room {
	
	private final int price = 220;
	private String type = "Double";

	public Double(int roomNumber) {
		super(roomNumber);
	}

	public int getPrice() {
		return price;
	}

	public String toString() {
		return "Room Type: " + type + "\tRoom Number: " + this.getRoomNumber();
	}
}