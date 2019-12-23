package Empresa;

public class Moto implements Vehiculo{
	
	public String tipo="Moto";
		
	public Moto(int capacidad, float peso, int plazas, int ruedas){
		this.tipo = "Moto";
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
