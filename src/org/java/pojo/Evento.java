package org.java.pojo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Evento {

	private String title;
	private LocalDateTime date;
	private int totalSeats;
	private  int reservedSeats = 0;
	private static final LocalDateTime today = LocalDateTime.now();
	private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

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

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(String date) throws Exception {
		LocalDateTime dateTime = LocalDateTime.parse(date, dtf);
		if (this.compareDate(dateTime) >= 0)
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
	
	public int compareDate(LocalDateTime dateTime) {
		return dateTime.compareTo(today);
	}
	
	public void prenota() throws Exception{
		if(this.compareDate(this.date) >= 0 || this.totalSeats == this.reservedSeats) 
			throw new Exception("Non ci sono più posti disponibili oppure l'evento è concluso");
		else 
			this.reservedSeats++;
	}
	
	public void disdici() throws Exception {
		if(this.compareDate(this.date) >= 0 || this.reservedSeats == 0)
			throw new Exception("Non ci sono posti prenotati da disdire oppure l'evento è concluso");
		else
			this.reservedSeats--;
	}

	@Override
	public String toString() {
		return "L'evento " + this.title + " si terrà il " + dtf.format(this.date) + "\n"
				+ "Il numero di posti totali è " + this.totalSeats + " mentre le prenotazione sono " + reservedSeats;
	}

}
