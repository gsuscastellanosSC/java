package Empresa.MODEL;

public class Bicicleta extends Vehiculo{
	public Bicicleta(int capacidad, float peso) {
		super(capacidad, peso);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void verVehiculosDisponibles() {
		// TODO Auto-generated method stub
		if(getCapacidad() > 0) {
			System.out.println("Plazas disponibles : " + getCapacidad() + " plazas, peso disponible : " + getPeso() + " kg, Bicicletas disponibles: " + "1" + " Bicicleta disponible, Capacidad de Personas : " + " 1 " + " persona, Peso maximo : 100 kg");
		}else {
			System.out.println("Plazas disponibles : " + getCapacidad() + " plazas, peso disponible : " + getPeso() + " kg, Bicicletas disponibles: " + "0" + " Bicicletas disponibles, Capacidad de Personas : " + " 1 " + " persona, Peso maximo : 100 kg");
		}
	}

}
