package com.revature.hotel_reservation.model;

public class Room {
	private int room_number;
	private int room_type_id;
	private int occupied;
	public Room(int room_number, int room_type_id, int occupied) {
		super();
		this.room_number = room_number;
		this.room_type_id = room_type_id;
		this.occupied = occupied;
	}
	public int getRoom_number() {
		return room_number;
	}
	public void setRoom_number(int room_number) {
		this.room_number = room_number;
	}
	public int getRoom_type_id() {
		return room_type_id;
	}
	public void setRoom_type_id(int room_type_id) {
		this.room_type_id = room_type_id;
	}
	public int getOccupied() {
		return occupied;
	}
	public void setOccupied(int occupied) {
		this.occupied = occupied;
	}
	
	@Override
	public String toString() {
		return "Rooms [room_number=" + room_number + ", room_type_id=" + room_type_id + ", occupied=" + occupied + "]";
	}
	
	
}
