package com.hotelreservationsystem;

public class PentHouse extends Room {
	private final int price = 2500;
	private String type = "PentHouse";

	public PentHouse(int roomNumber) {
		super(roomNumber);
	}

	public int getPrice() {
		return price;
	}

	public String toString() {
		return "Room Type: " + type + "\tRoom Number: " + this.getRoomNumber();
	}
}