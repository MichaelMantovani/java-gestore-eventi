package org.java.pojo;

import java.math.BigDecimal;
import java.math.MathContext;
import java.text.NumberFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Concerto extends Evento {
	private LocalTime time;
	private BigDecimal price;
	static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm");

	public Concerto(String title, String date, int totalSeats, String time, double price) throws Exception {
		super(title, date, totalSeats);
		setTime(time);
		setPrice(price);
	}

	public LocalTime getTime() {
		return time;
	}

	public void setTime(String time) {
		LocalTime eventTime = LocalTime.parse(time, dtf);
		this.time = eventTime;
	}

	public String getPrice() {
		return NumberFormat.getCurrencyInstance().format(price);
	}

	public void setPrice(double price) {
		BigDecimal eventPrice = new BigDecimal(price, MathContext.DECIMAL32);
		this.price = eventPrice;
	}

	@Override
	public String toString() {

		return super.toString() + " alle " + this.time + "\n" + "Il biglietto costa " + getPrice();
	}

}
