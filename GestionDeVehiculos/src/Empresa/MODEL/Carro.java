package Empresa.MODEL;

public class Carro extends Vehiculo{
	
	public Carro(int capacidad, float peso) {
		super(capacidad, peso);
		// TODO Auto-generated constructor stub
		
	}

	@Override
	public void verVehiculosDisponibles() {
		// TODO Auto-generated method stub
		if(getCapacidad() > 0) {
			System.out.println("Plazas disponibles : " + getCapacidad() + " plazas, peso disponible : " + getPeso() + " kg, Carros disponibles: " + " 1 " + " Carro disponible, Capacidad de Personas : 4 personas, Peso maximo : 500 kg");
		}else
		{
			System.out.println("Plazas disponibles : " + getCapacidad() + " plazas, peso disponible : " + getPeso() + " kg, Carros disponibles: " + " 0 " + " Carro disponibles, Capacidad de Personas : 4 personas, Peso maximo : 500 kg");
		}
		
	}
}
