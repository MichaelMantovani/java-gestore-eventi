package org.java;

import org.java.pojo.Evento;

public class Main {
	public static void main(String[] args)  {
	
		
		try {
			Evento matrimonio = new Evento("Matrimonio", "23/09/2023 11:00:00", 100);
			System.out.println(matrimonio);
			matrimonio.prenota();
			System.out.println(matrimonio);
			matrimonio.disdici();
			System.out.println(matrimonio);
		} catch (Exception e) {
			System.out.println(e.getMessage());;
		}
		
		
		
		
		
	
		

	}
	
	
}
