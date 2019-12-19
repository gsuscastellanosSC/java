package Empresa;

public class Moto implements Vehiculo{
	@Override
	public void VerDisponibilidad(int capacidadDePersonas, float pesoMaximo) {
		System.out.println("La moto tiene capacidad de:" + capacidadDePersonas + " pesona," + " Un peso de " + pesoMaximo + " Kilogramos");
	}
}
