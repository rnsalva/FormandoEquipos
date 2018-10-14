package io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class Archivo {

	public Formar leerArchivo(String path) throws FileNotFoundException{
	
		FileReader fr = new FileReader(path);
		Scanner sc = new Scanner(fr);
		
		int i = sc.nextInt();
		int cantLetras = sc.nextInt();
		String[] vectorRespuestas = new String[i];
		for(int j = 0; j < i; j++)
			vectorRespuestas[j] = sc.nextLine();
		
		sc.close();
		return new Formar(vectorRespuestas, cantLetras);
	}
	
	public void escribirArchivo(String path, String[] respuesta) throws FileNotFoundException{
		PrintWriter ptr = new PrintWriter(path);
		for(String cadena:respuesta){
			ptr.println(cadena);
		}
		ptr.close();
	}
}
