package org.java.pojo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;


public class ProgrammaEventi {
	private String title;
	private List<Evento> events;

	public ProgrammaEventi(String title, List<Evento> events) {
		setTitle(title);
		setEvents(events);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<Evento> getEvents() {
		return events;
	}

	public void setEvents(List<Evento> events) {
		this.events = events;
	}
	
	 public void addEvento(Evento evento) {
	        events.add(evento);
	 }
	 
	public List<Evento> getEventInDate(String time){
		 List<Evento> eventInDate = new ArrayList<Evento>();
		 LocalDate date = LocalDate.parse(time, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		 for (Evento evento : events) {
			if (evento.getDate().isEqual(date)) {
				eventInDate.add(evento);
			}
		}
		 return eventInDate;
	 }
	

	
	@Override
	public String toString() {
		
		return "Nome lista di eventi: " +  this.title + "\n" +  "Eventi: " + this.events; 
	}
}
