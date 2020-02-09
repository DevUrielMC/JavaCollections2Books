package com.javacollections2books.model;

public class Libro {

		//Declaración de variables privadas
		private String titulo;
		private String autor;
		private int ISBN;
		
		//Constructor parametrizado
		public Libro(String titulo, String autor, int ISBN) {
			this.titulo=titulo;
			this.autor=autor;
			this.ISBN=ISBN;
			
		}
		
		//Metodo para visualizar los parametros de los objetos libro
		public String getDatos() {
			return "El titulo es: " + titulo + " El autor es: "+ autor + " El ISBN ES: " + ISBN;
					
		}

	
	
}
