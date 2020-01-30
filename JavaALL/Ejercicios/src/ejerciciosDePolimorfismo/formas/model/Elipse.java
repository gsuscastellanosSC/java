package ejerciciosDePolimorfismo.formas.model;

public class Elipse extends Forma{
	float radioMayor;
	float radioMenor;
	public Elipse(String color, Punto coordenadaCentro, String nombreForma, float radioMayor, float radioMenor) {
		super(color, coordenadaCentro, nombreForma);
		this.radioMayor = radioMayor;
		this.radioMenor = radioMenor;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+",\nRadio mayor: " + getRadioMayor()
							   +",\nRadio menor: " + getRadioMenor();
	}

	@Override
	public float calcularArea() {
		// TODO Auto-generated method stub
		float area = (float)Math.PI*(getRadioMayor()*getRadioMenor());
		return area;
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
