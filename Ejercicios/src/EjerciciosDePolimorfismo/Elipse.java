package EjerciciosDePolimorfismo;

public class Elipse extends Forma{
	float radioMayor;
	float radioMenor;
	public Elipse(String color, Punto coordenadaCentro, String nombreForma, float radioMayor, float radioMenor) {
		super(color, coordenadaCentro, nombreForma);
		this.radioMayor = radioMayor;
		this.radioMenor = radioMenor;
	}

	@Override
	public void imprimir() {
		System.out.println("Tipo de forma: " + this.getNombreForma());
		System.out.println("Color: " + this.getColor());
		System.out.println("Centro (" + this.getCoordenadaCentro().getX()+", "+this.getCoordenadaCentro().getY()+")");
		System.out.println("Radio mayor: " + getRadioMayor());
		System.out.println("Radio menor: " + getRadioMenor());
	}

	@Override
	public void calcularArea() {
		// TODO Auto-generated method stub
		System.out.println("El area de la " + this.getNombreForma() + " es: " + Math.PI*(getRadioMayor()*getRadioMenor()));
	}

	@Override
	public void calculaPerimetro() {
		// TODO Auto-generated method stub
		System.out.println("El perimetro de la "+this.getNombreForma()+ " es: "+2*Math.PI*Math.sqrt((Math.pow(getRadioMayor(), 2)+Math.pow(getRadioMenor(), 2))/2));
	}

	public float getRadioMayor() {
		return radioMayor;
	}

	public void setRadioMayor(float radioMayor) {
		this.radioMayor = radioMayor;
	}

	public float getRadioMenor() {
		return radioMenor;
	}

	public void setRadioMenor(float radioMenor) {
		this.radioMenor = radioMenor;
	}
	
}
