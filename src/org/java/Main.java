package org.java;

import java.util.Scanner;

import org.java.pojo.Concerto;
import org.java.pojo.Evento;

public class Main {
	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//
//		System.out.println("Vuoi creare un nuovo evento (si/no)?");
//		boolean newEvent = in.nextLine().equals("si") ? true : false;
//		if (newEvent) {
//			boolean retry = false;
//			Evento evento = null;
//
////			Chiedo all'utente tutte le informazioni per creare un evento e provo a crearlo
//			do {
//				System.out.println("Qual è il titolo dell'evento? ");
//				String title = in.nextLine();
//				System.out.println("In che giorno e a che ora si terrà? (Es. 23/10/2024 11:00:00)");
//				String dateTime = in.nextLine();
//				System.out.println("Quanti sono i posti totali disponibili");
//				int totalSeats = Integer.valueOf(in.nextLine());
//
//				try {
//					evento = new Evento(title, dateTime, totalSeats);
//					retry = false;
//				} catch (Exception e) {
//					System.out.println(e.getMessage());
//					retry = true;
//				}
//			} while (retry);
//
////			Chiedo all'utente quante prenotazioni vuole effettuare e provo ad effettuarle
//			do {
//				System.out.println("Quante prenotazione vuoi effettuare?");
//				int totalReservation = Integer.valueOf(in.nextLine());
//				try {
//					evento.prenota(totalReservation);
//					System.out.println("Posti prenotati :" + evento.getReservedSeats() + "\n" + "Posti disponibili: "
//							+ evento.getTotalSeats());
//					retry = false;
//				} catch (Exception e) {
//					System.out.println(e.getMessage());
//					retry = true;
//				}
//			} while (retry);
//
////			Chiedo all'utente se e quante prenotazione vuole disdire e provo a disdirle
//			System.out.println("Vuoi disdire delle prenotazioni? (si/no)");
//			boolean cancellationEnabled = in.nextLine().equals("si") ? true : false;
//			if (cancellationEnabled) {
//				do {
//					System.out.println("Quante prenotazioni vuoi disdire?");
//					int deleteReservation = Integer.valueOf(in.nextLine());
//					try {
//						evento.disdici(deleteReservation);
//						System.out.println("Posti prenotati :" + evento.getReservedSeats() + "\n"
//								+ "Posti disponibili: " + evento.getTotalSeats());
//						retry = false;
//					} catch (Exception e) {
//						System.out.println(e.getMessage());
//						retry = true;
//					}
//				} while (retry);
//			} else
//				System.out.println("Arrivederci");
//
//		} else
//			System.out.println("Arrivederci");
//
		try {
			Concerto metallica = new Concerto("Metallica", "23/10/2024", 1500, "11:00", 11.50);
			System.out.println(metallica);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
