package Empresa;

public class Carro implements Vehiculo{
	
	@Override
	public void VerDisponibilidad(int capacidadDePersonas, float pesoMaximo) {
		System.out.println("El carro tiene capacidad de:" + capacidadDePersonas + " pesona," + " Un peso de " + pesoMaximo + " Kilogramos");
	}
}
