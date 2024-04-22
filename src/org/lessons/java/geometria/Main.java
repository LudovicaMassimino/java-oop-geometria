package org.lessons.java.geometria;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Inserisci la base del rettangolo: ");
		int base = input.nextInt();
		
		System.out.print("Inserisci l'altezza del rettangolo: ");
		int altezza = input.nextInt();
		
		Rettangolo rettangolo = new Rettangolo(base, altezza);
		
		int area = rettangolo.calcolaArea();
		int perimetro = rettangolo.calcolaPerimetro();
		
		System.out.println("Base: " + base );
		System.out.println("Altezza: " + altezza);
		System.out.println("Perimetro: " + perimetro);
		System.out.println("Area: " + area);

        rettangolo.disegna();
	}

}
