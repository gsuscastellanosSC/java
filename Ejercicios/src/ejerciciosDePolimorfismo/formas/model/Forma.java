package ejerciciosDePolimorfismo.Formas.model;

import java.util.Scanner;

public abstract class Forma {
	private String color;
	Punto coordenadaCentro;
	private String NombreForma;
	
	
	public Forma(String color, Punto coordenadaCentro, String nombreForma) {
		this.color = color;
		this.coordenadaCentro = coordenadaCentro;
		NombreForma = nombreForma;
	}
	
	public abstract void imprimir();
	
	public abstract float calcularArea();
	
	public abstract void calculaPerimetro();
	
	public void moverFormaAsuCentro(Scanner sc) {
		System.out.println("Ingrese el nuevo centro de la forma " + getNombreForma() + "(+-x,+-y)");
		String element = sc.nextLine();
		String[] elements = element.trim().split(",");
		
		String elemntX  = elements[0].trim();
		String elementY = elements[1].trim(); 
		
		Integer x = Integer.parseInt(elemntX);
		Integer y = Integer.parseInt(elementY);
		
		coordenadaCentro.setX(x);	
		coordenadaCentro.setY(y);
	};
	
	public void getColorAndSetColor() {
		System.out.println("Color Antes: " + getColor());
		System.out.println("Ingrese el nuevo color");
		Scanner sc = new Scanner(System.in);
		String nuevoColor = sc.nextLine();
		setColor(nuevoColor);
		System.out.println("Nuevo color : " + getColor());
	}
	
	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public Punto getCoordenadaCentro() {
		return coordenadaCentro;
	}


	public void setCoordenadaCentro(Punto coordenadaCentro) {
		this.coordenadaCentro = coordenadaCentro;
	}


	public String getNombreForma() {
		return NombreForma;
	}


	public void setNombreForma(String nombreForma) {
		NombreForma = nombreForma;
	}
}
