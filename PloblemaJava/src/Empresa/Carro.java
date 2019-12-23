package Empresa;

public class Carro implements Vehiculo{
	
	public String tipo= "Carro";
		
	public Carro(int capacidad, float peso, int plazas, int ruedas) {
		// TODO Auto-generated constructor stub
		this.tipo = "Carro";
	}
	
	@Override
	public void bajar(String NombrePersona, String NombreVehiculo) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public boolean Subir(String NombrePersona, String NombreVehiculo) {
		// TODO Auto-generated method stub
		return false;
	}




	@Override
	public void VerDisponibilidad() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void verPesonasDentroVehiculos() {
		System.out.println("Tipo Vehiculo: "+ tipo);
		
	}
}
