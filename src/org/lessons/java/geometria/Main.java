package org.lessons.java.geometria;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//prompt in java
		System.out.print("Inserisci la base del rettangolo: ");
		int base = input.nextInt();
		
		System.out.print("Inserisci l'altezza del rettangolo: ");
		int altezza = input.nextInt();
		
		//istanza: creo un nuovo rettangolo con i valori inseriti dall'utente
		Rettangolo mioRettangolo = new Rettangolo(base, altezza);
		
		int area = mioRettangolo.calcolaArea();
		int perimetro = mioRettangolo.calcolaPerimetro();
		
		System.out.println("Base: " + base );
		System.out.println("Altezza: " + altezza);
		System.out.println("Perimetro: " + perimetro); // sarebbe mioRettangolo.calcolaPerimetro()
		System.out.println("Area: " + area); // sarebbe mioRettangolo.calcolaArea()

        mioRettangolo.disegna();
        
        input.close();
	}

}
