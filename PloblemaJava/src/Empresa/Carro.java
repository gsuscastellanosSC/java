package Empresa;

public class Carro implements Vehiculo{
	
	public String tipo;
	int capacidad; 
	float peso; 
	int plazas; 
	int ruedas;
		
	public Carro(int capacidad, float peso, int plazas, int ruedas) {
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
		System.out.println(tipo +" " + " " + plazas +" "+ peso);
		
	}

	@Override
	public void verPesonasDentroVehiculos() {
		System.out.println("Tipo Vehiculo: "+ tipo);
		
	}
}
