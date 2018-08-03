package com.revature.hotel_reservation.model;

import java.sql.Timestamp;

public class Transaction_history {
	private long transaction_id;
	private long reservation_id;
	private double total_amount;
	private String card_type;
	private int four_digit_ending;
	private String name_on_card;
	private Timestamp time_stamp;
	public Transaction_history(long transaction_id, long reservation_id, double total_amount, String card_type,
			int four_digit_ending, String name_on_card, Timestamp time_stamp) {
		super();
		this.transaction_id = transaction_id;
		this.reservation_id = reservation_id;
		this.total_amount = total_amount;
		this.card_type = card_type;
		this.four_digit_ending = four_digit_ending;
		this.name_on_card = name_on_card;
		this.time_stamp = time_stamp;
	}
	public long getTransaction_id() {
		return transaction_id;
	}
	public void setTransaction_id(long transaction_id) {
		this.transaction_id = transaction_id;
	}
	public long getReservation_id() {
		return reservation_id;
	}
	public void setReservation_id(long reservation_id) {
		this.reservation_id = reservation_id;
	}
	public double getTotal_amount() {
		return total_amount;
	}
	public void setTotal_amount(double total_amount) {
		this.total_amount = total_amount;
	}
	public String getCard_type() {
		return card_type;
	}
	public void setCard_type(String card_type) {
		this.card_type = card_type;
	}
	public int getFour_digit_ending() {
		return four_digit_ending;
	}
	public void setFour_digit_ending(int four_digit_ending) {
		this.four_digit_ending = four_digit_ending;
	}
	public String getName_on_card() {
		return name_on_card;
	}
	public void setName_on_card(String name_on_card) {
		this.name_on_card = name_on_card;
	}
	public Timestamp getTime_stamp() {
		return time_stamp;
	}
	public void setTime_stamp(Timestamp time_stamp) {
		this.time_stamp = time_stamp;
	}
	
	@Override
	public String toString() {
		return "Transaction_history [transaction_id=" + transaction_id + ", reservation_id=" + reservation_id
				+ ", total_amount=" + total_amount + ", card_type=" + card_type + ", four_digit_ending="
				+ four_digit_ending + ", name_on_card=" + name_on_card + ", time_stamp=" + time_stamp + "]";
	}
	
}
