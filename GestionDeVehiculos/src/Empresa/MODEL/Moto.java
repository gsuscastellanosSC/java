package Empresa.MODEL;

public class Moto extends Vehiculo{

	public Moto(int capacidad, float peso) {
		super(capacidad, peso);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void verVehiculosDisponibles() {
		// TODO Auto-generated method stub
		if(getCapacidad() > 0) {
			System.out.println("Plazas disponibles : " + getCapacidad() + " plazas, peso disponible : " + getPeso() + " kg, Motos disponibles: " + " 1 " + " Moto disponible, Capacidad de Personas : 2 personas, Peso maximo : 150 kg");
		}else {
			System.out.println("Plazas disponibles : " + getCapacidad() + " plazas, peso disponible : " + getPeso() + " kg, Motos disponibles: " + " 0 " + " Motos disponibles, Capacidad de Personas : 2 personas, Peso maximo : 150 kg");
		}
	}
}
