package com.revature.hotel_reservation.model;

public class Reservation_status {
	private int status_id;
	private String status;
	
	public Reservation_status(int status_id, String status) {
		super();
		this.status_id = status_id;
		this.status = status;
	}

	public int getStatus_id() {
		return status_id;
	}

	public void setStatus_id(int status_id) {
		this.status_id = status_id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Reservation_status [status_id=" + status_id + ", status=" + status + "]";
	}
	
	
}
