package org.java;

import java.util.ArrayList;
import java.util.List;

import org.java.pojo.Evento;
import org.java.pojo.ProgrammaEventi;

public class MainEvent {
    public static void main(String[] args) {
        List<Evento> events = new ArrayList<>();

        try {
        	Evento test2 = new Evento("test2", "23/10/2026", 100);
        	events.add(test2);
        } catch (Exception e) {
        	e.printStackTrace();
        }
        
        try {
            Evento metallica = new Evento("Metallica", "23/10/2024", 100);
            events.add(metallica);
        } catch (Exception e) {
            e.printStackTrace();
        }
        


        ProgrammaEventi testEventi = new ProgrammaEventi("Test", events);

        try {
            Evento test3 = new Evento("test", "23/10/2025", 100);
            System.out.println(test3);
            testEventi.addEvento(test3);
            System.out.println(testEventi);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        System.out.println("Ci sono " + testEventi.getEventsCount() + " eventi in programma");
        System.out.println(testEventi.toStringFormat());
        

        
    }
}