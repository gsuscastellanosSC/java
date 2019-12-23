package Empresa;

public class Bicicleta implements Vehiculo{
		
	public String tipo;
	int capacidad; 
	float peso; 
	int plazas; 
	int ruedas;
	
	public Bicicleta(int capacidad, float peso, int plazas, int ruedas) {
		this.tipo = "Bicicleta";
		
	}
	

	@Override
	public boolean Subir(String NombrePersona, String NombreVehiculo) {
		// TODO Auto-generated method stub
		System.out.println(Persona.Personas.contains(NombrePersona) +" " + Vehiculos.contains(NombreVehiculo));
		
		return Vehiculos.contains(NombreVehiculo);
		
	}

	@Override
	public void bajar(String NombrePersona, String NombreVehiculo) {
		// TODO Auto-generated method stub
		 System.out.println(tipo);
	}


	@Override
	public void VerDisponibilidad() {
		// TODO Auto-generated method stub
		System.out.println(tipo);
		
	}


	@Override
	public void verPesonasDentroVehiculos() {
		System.out.println("Tipo Vehiculo: "+ tipo);
		
	}
}
