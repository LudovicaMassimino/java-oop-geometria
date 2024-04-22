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
		 for (int i = 0; i <= this.altezza; i++) {
			 for (int y = 0; y <= this.base; y++) {
				 if(i == 0 || i == this.altezza) {
					 System.out.print("$ ");
				 } else if(y == 0 || y == this.base){
					 System.out.print("$ ");
				 } else {
					 System.out.print("  ");
				 }
				 if(y == this.base) {
					 System.out.print("\n");
				 }
			 }
		 }
	 }
	
}
