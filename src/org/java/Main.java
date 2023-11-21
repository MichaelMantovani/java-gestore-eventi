package org.java;

import org.java.pojo.Evento;

public class Main {
	public static void main(String[] args)  {
	
		
		try {
			Evento matrimonio = new Evento("Matrimonio", "23/09/2023 11:00:00", 0);
			System.out.println(matrimonio);
		} catch (Exception e) {
			System.out.println(e.getMessage());;
		}
		
		
		
		
		
	
		

	}
	
	
}
