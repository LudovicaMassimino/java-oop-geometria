package org.lessons.java.geometria;

public class Rettangolo {
	
	//1° step incapsulamento: inserisco gli attributi private
	private int base;
	private int altezza;
	
	//costruttore Rettangolo per inizializzare base e altezza
	public Rettangolo(int base, int altezza) {
		this.base = base;
		this.altezza = altezza;
	}
	
	// 2° step incapsulamento: getter e setter
	public int getBase() {
		return base;
	}
	public int getAltezza() {
		return altezza;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public void setAltezza(int altezza) {
		this.altezza = altezza;
	}
	
	//metodo per calcolare l'area 
	public int calcolaArea() {
		int area = this.base * this.altezza;
		return area;
	}
	
	//metodo per calcolare il perimetro 
	public int calcolaPerimetro() {
		int perimetro = (this.base + this.altezza) * 2;
		return perimetro;
	}
	
	//metodo per disegnare il rettangolo in console
	public void disegna () {
		 for (int i = 0; i < this.altezza; i++) {
			 for (int x = 0; x < this.base; x++) {
				 if(i == 0 || i == this.altezza -1 || x == 0 || x == this.base - 1) {
					 System.out.print("$ ");
				 } else {
					 System.out.print("  ");
				 }
			 }
			 System.out.println();
		 }
	 }
	
}
