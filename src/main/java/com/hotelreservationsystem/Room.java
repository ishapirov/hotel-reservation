package com.hotelreservationsystem;

public class Room {
	protected int roomNumber;
	protected int[] datesBooked;
	private final int calendarSize = 31;

	public Room(int roomNumber) {
		this.roomNumber = roomNumber;
		datesBooked = new int[calendarSize];
		for (int i = 0; i < calendarSize; i++) {
			datesBooked[i] = 0;
		}
	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public int[] getDatesBooked() {
		return datesBooked;
	}

	public int getPrice() {
		return 0;
	}

	public boolean checkIfAvailable(int start, int duration) {
		for (int i = start; i < (start + duration); i++) {
			if (datesBooked[i] == 1)
				return false;
		}
		return true;
	}

	public void updateDates(int start, int duration) {
		for (int i = start; i < (start + duration); i++) {
			datesBooked[i] = 1;
		}
	}

	public void clearDates(int start, int duration) {
		for (int i = start; i < (start + duration); i++) {
			datesBooked[i] = 0;
		}
	}

}