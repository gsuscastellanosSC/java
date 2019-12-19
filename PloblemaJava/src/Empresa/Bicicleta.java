package Empresa;

public class Bicicleta implements Vehiculo{
	@Override
	public void VerDisponibilidad(int capacidadDePersonas, float pesoMaximo) {
		System.out.println("La Bicicleta tiene capacidad de:" + capacidadDePersonas + " pesona," + " Un peso de " + pesoMaximo + " Kilogramos");
	}
}
