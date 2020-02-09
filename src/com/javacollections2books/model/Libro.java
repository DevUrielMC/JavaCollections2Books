package com.javacollections2books.model;

public class Libro {

	// Declaración de variables privadas
	private String titulo;
	private String autor;
	private int ISBN;

	// Constructor parametrizado
	public Libro(String titulo, String autor, int ISBN) {
		this.titulo = titulo;
		this.autor = autor;
		this.ISBN = ISBN;

	}

	// Metodo para visualizar los parametros de los objetos libro
	public String getDatos() {
		return "El titulo es: " + titulo + " El autor es: " + autor + " El ISBN ES: " + ISBN;

	}

	// Creación de método para sobreescribir el método equals por defecto con la finalidad de comparar el contenido de cada objeto
	public boolean equals(Object obj) {
		if (obj instanceof Libro) { 			// instanceof hace referencia a que el objeto es una instancia de libro
			Libro otroLibro = (Libro) obj; 		// Creamos un objeto de tipo Libro, y hacemos un casting para que los
												// parametros de tipo "obj" se almacenen en la variable "otroLibro"

			if (this.ISBN == otroLibro.ISBN) { 	// Ocupamos this hacer referencia al objeto actual, y lo compara con el
												// otroLibro objeto casteado
				return true;					//De comparar y ser iguales devuelve verdadero
			} else {
				return false;					//Sino un falso
			}

		} else {
			return false;
		}
	}

}
