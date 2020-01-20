package EjerciciosDePolimorfismo;

import java.util.Scanner;

public class Rectangulo extends Forma {
	private float lado_menor;
	private float lado_mayor;
	
	public Rectangulo(String color, Punto coordenadaCentro, String nombreForma, float lado_menor, float lado_mayor) {
		super(color, coordenadaCentro, nombreForma);
		this.lado_menor = lado_menor;
		this.lado_mayor = lado_mayor;
		// TODO Auto-generated constructor stub
	}
	public void calcularArea(){
		System.out.println("Area: " + getLado_menor()*getLado_mayor());
	} 
	public void calculaPerimetro() {
		System.out.println("Perímetro: " + 2*(getLado_menor()+getLado_mayor()));
	}
	
	public void cambiarTamanoRectangulo(float scala) {
		setLado_mayor(getLado_mayor()*scala);
		setLado_menor(getLado_menor()*scala);
	}
	@Override
	public void imprimir() {
		// TODO Auto-generated method stub
		System.out.println("Tipo de forma: " + this.getNombreForma());
		System.out.println("Color: " + this.getColor());
		System.out.println("Centro (" + this.getCoordenadaCentro().getX()+", "+this.getCoordenadaCentro().getY()+")");
		System.out.println("Lado menor: " + getLado_menor());
		System.out.println("Lado mayor: " + getLado_mayor());
	}

	public float getLado_menor() {
		return lado_menor;
	}

	public void setLado_menor(float lado_menor) {
		this.lado_menor = lado_menor;
	}

	public float getLado_mayor() {
		return lado_mayor;
	}

	public void setLado_mayor(float lado_mayor) {
		this.lado_mayor = lado_mayor;
	}
}
