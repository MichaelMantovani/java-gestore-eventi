package org.java.pojo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Evento {

	private String title;
	private LocalDateTime date;
	private int totalSeats;
	private static int reservedSeats = 0;
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
		if (dateTime.compareTo(today) >= 0)
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

	@Override
	public String toString() {
		return "L'evento " + this.title + " si terrà il " + dtf.format(this.date) + "\n"
				+ "Il numero di posti totali è " + this.totalSeats + " mentre le prenotazione sono " + reservedSeats;
	}

}
