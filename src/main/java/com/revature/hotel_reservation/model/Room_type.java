package com.revature.hotel_reservation.model;

public class Room_type {
	private int type_id;
	private String room_type;
	private String limits;
	private double rate;
	private int total_rooms;
	public Room_type(int type_id, String room_type, String limits, double rate, int total_rooms) {
		super();
		this.type_id = type_id;
		this.room_type = room_type;
		this.limits = limits;
		this.rate = rate;
		this.total_rooms = total_rooms;
	}
	public int getType_id() {
		return type_id;
	}
	public void setType_id(int type_id) {
		this.type_id = type_id;
	}
	public String getRoom_type() {
		return room_type;
	}
	public void setRoom_type(String room_type) {
		this.room_type = room_type;
	}
	public String getLimits() {
		return limits;
	}
	public void setLimits(String limits) {
		this.limits = limits;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	public int getTotal_rooms() {
		return total_rooms;
	}
	public void setTotal_rooms(int total_rooms) {
		this.total_rooms = total_rooms;
	}
	
	@Override
	public String toString() {
		return "Room_types [type_id=" + type_id + ", room_type=" + room_type + ", limits=" + limits + ", rate=" + rate
				+ ", total_rooms=" + total_rooms + "]";
	}
	
	
}
