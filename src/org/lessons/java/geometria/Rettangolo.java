package org.lessons.java.geometria;

public class Rettangolo {
	
	int base;
	int altezza;
	
	public Rettangolo(int base, int altezza) {
		this.base = base;
		this.altezza = altezza;
	}
	
	public int calcolaArea() {
		int area = this.base * this.altezza;
		return area;
	}
	public int calcolaPerimetro() {
		int perimetro = (this.base + this.altezza) * 2;
		return perimetro;
	}
		
	 public void disegna () {
		 for (int i = 0; i < altezza; i++) {
			 for (int x = 0; x < base; x++) {
				 if(i == 0 || i == altezza -1 || x == 0 || x == base - 1) {
					 System.out.print("$ ");
				 } else {
					 System.out.print("  ");
				 }
			 }
			 System.out.println();
		 }
	 }
	
}
