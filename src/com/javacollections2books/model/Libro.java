package com.javacollections2books.model;

public class Libro {

	
		
		private String titulo;
		private String autor;
		private int ISBN;
		
		public Libro(String titulo, String autor, int ISBN) {
			this.titulo=titulo;
			this.autor=autor;
			this.ISBN=ISBN;
			
		}
		
		public String getDatos() {
			return "El titulo es: " + titulo + " El autor es: "+ autor + " El ISBN ES: " + ISBN;
					
		}

	
	
}
