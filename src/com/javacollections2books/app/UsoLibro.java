package com.javacollections2books.app;

import com.javacollections2books.model.Libro;

public class UsoLibro {

	public static void main(String[] args) {
		
		//Instanciamos dos objetos de tipo libro y los parametrizamos
		Libro libro1 = new Libro ("El principito", "Uriel",654651);
		
		Libro libro2 = new Libro ("Libro del amor", "Carmen", 654651);
		
		//Segmento de código para comparar los dos objetos 
		if(libro1.equals(libro2))
		{
			System.out.println("Los libros son iguales");
			System.out.println(libro1.hashCode());				//Inplementamos el método HashCode para identificar especificamente 
																//en que espacio de memoria está alojado el objeto
			System.out.println(libro2.hashCode());
		}else {
			System.out.println("Los libros no son iguales");
			System.out.println(libro1.hashCode());
			System.out.println(libro2.hashCode());
		}
		
	}

}
