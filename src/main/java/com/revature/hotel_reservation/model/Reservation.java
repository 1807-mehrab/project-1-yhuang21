package com.revature.hotel_reservation.model;

import java.sql.Date;

public class Reservation {
	private long reservation_id;
	private String customer_firstName;
	private String customer_lastName;
	private int room_type_id;
	private Date check_in_date;
	private int number_of_nights;
	private int status_id;
	private int room_number;
	public Reservation(long reservation_id, String customer_firstName, String customer_lastName, int room_type_id,
			Date check_in_date, int number_of_nights, int status_id, int room_number) {
		super();
		this.reservation_id = reservation_id;
		this.customer_firstName = customer_firstName;
		this.customer_lastName = customer_lastName;
		this.room_type_id = room_type_id;
		this.check_in_date = check_in_date;
		this.number_of_nights = number_of_nights;
		this.status_id = status_id;
		this.room_number = room_number;
	}
	public long getReservation_id() {
		return reservation_id;
	}
	public void setReservation_id(long reservation_id) {
		this.reservation_id = reservation_id;
	}
	public String getCustomer_firstName() {
		return customer_firstName;
	}
	public void setCustomer_firstName(String customer_firstName) {
		this.customer_firstName = customer_firstName;
	}
	public String getCustomer_lastName() {
		return customer_lastName;
	}
	public void setCustomer_lastName(String customer_lastName) {
		this.customer_lastName = customer_lastName;
	}
	public int getRoom_type_id() {
		return room_type_id;
	}
	public void setRoom_type_id(int room_type_id) {
		this.room_type_id = room_type_id;
	}
	public Date getCheck_in_date() {
		return check_in_date;
	}
	public void setCheck_in_date(Date check_in_date) {
		this.check_in_date = check_in_date;
	}
	public int getNumber_of_nights() {
		return number_of_nights;
	}
	public void setNumber_of_nights(int number_of_nights) {
		this.number_of_nights = number_of_nights;
	}
	public int getStatus_id() {
		return status_id;
	}
	public void setStatus_id(int status_id) {
		this.status_id = status_id;
	}
	public int getRoom_number() {
		return room_number;
	}
	public void setRoom_number(int room_number) {
		this.room_number = room_number;
	}
	
	@Override
	public String toString() {
		return "Reservation [reservation_id=" + reservation_id + ", customer_firstName=" + customer_firstName
				+ ", customer_lastName=" + customer_lastName + ", room_type_id=" + room_type_id + ", check_in_date="
				+ check_in_date + ", number_of_nights=" + number_of_nights + ", status_id=" + status_id
				+ ", room_number=" + room_number + "]";
	}
	
	
}
