package com.hotelreservationsystem;

public class Suite extends Room {
	private final int price = 380;
	private String type = "Suite";

	public Suite(int roomNumber) {
		super(roomNumber);
	}

	public int getPrice() {
		return price;
	}

	public String toString() {
		return "Room Type: " + type + "\tRoom Number: " + this.getRoomNumber();
	}

}