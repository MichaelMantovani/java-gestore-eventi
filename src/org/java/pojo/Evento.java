package org.java.pojo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Evento {

	private String title;
	private LocalDate date;
	private int totalSeats;
	private  int reservedSeats = 0;
	static final LocalDate today = LocalDate.now();
	static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	public Evento(String title, String date, int totalSeats) throws Exception {
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

	public LocalDate getDate() {
		return date;
	}

	public void setDate(String date) throws Exception {
		LocalDate dateTime = LocalDate.parse(date, dtf);
		if (this.compareDate(dateTime) <= 0)
			throw new Exception("**Inserisci una data valida**");
		else 
			this.date = dateTime;
	}

	public int getTotalSeats() {
		return totalSeats;
	}

	private void setTotalSeats(int totalSeats) throws Exception {
		if (totalSeats <= 0)
			throw new Exception("**Deve esserci almeno un posto**");
		else
			this.totalSeats = totalSeats;
	}

	public int getReservedSeats() {
		return reservedSeats;
	}
	
	public int compareDate(LocalDate dateTime) {
		return dateTime.compareTo(today);
	}
	
	public void prenota(int totalReservation) throws Exception{
		if(this.compareDate(this.date) <= 0 || this.totalSeats < totalReservation || this.reservedSeats == this.totalSeats) 
			throw new Exception("Non ci sono abbastanza posti disponibili oppure l'evento è concluso");
		else 
			this.reservedSeats+= totalReservation;
	}
	
	public void disdici(int totalDeleteReservation) throws Exception {
		if(this.compareDate(this.date) <= 0 || this.reservedSeats == 0 || totalDeleteReservation > this.reservedSeats)
			throw new Exception("Non ci sono posti prenotati da disdire oppure non ci sono abbastanza posti prenotati oppure  l'evento è concluso");
		else
			this.reservedSeats-= totalDeleteReservation;
	}

	@Override
	public String toString() {
		return "L'evento " + this.title + " si terrà il " + dtf.format(this.date);
	}

}
