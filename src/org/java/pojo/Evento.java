package org.java.pojo;

import java.time.LocalTime;

public class Evento {
	private String title;
	private LocalTime date;
	private int totalSeats;
	static int reservedSeats = 0;
	
	public Evento(String title, LocalTime date, int totalSeats) {
			setTitle(title);
			setDate(date);
			setTotalSeats(totalSeats);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public LocalTime getDate() {
		return date;
	}

	public void setDate(LocalTime date) {
		this.date = date;
	}

	public int getTotalSeats() {
		return totalSeats;
	}
	
	private void setTotalSeats(int totalSeats) {
		this.totalSeats = totalSeats;
	}

	public int getReservedSeats () {
		return reservedSeats;
	}
	
	
}
