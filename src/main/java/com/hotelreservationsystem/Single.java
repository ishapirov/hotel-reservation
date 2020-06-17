package com.hotelreservationsystem;

public class Single extends Room {
	private final int price = 180;
	private String type = "Single";

	public Single(int roomNumber) {
		super(roomNumber);
	}

	public int getPrice() {
		return price;
	}

	public String toString() {
		return "Room Type: " + type + "\tRoom Number: " + this.getRoomNumber();
	}
}