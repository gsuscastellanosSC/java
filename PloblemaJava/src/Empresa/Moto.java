package Empresa;

public class Moto implements Vehiculo{
	
	private final String tipo;
	private int capacidad; 
	private float peso; 
	private int plazas; 
	private int ruedas;
	private static int cantidadMotos = 0;
	
	public Moto(int capacidad, float peso, int plazas, int ruedas) {
		this.tipo = "Moto";
		this.capacidad = capacidad;
		this.peso = peso;
		this.plazas = plazas;
		this.ruedas = ruedas;
		cantidadMotos++;
	}
	public int getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public int getPlazas() {
		return plazas;
	}
	public void setPlazas(int plazas) {
		this.plazas = plazas;
	}
	public int getRuedas() {
		return ruedas;
	}
	public void setRuedas(int ruedas) {
		this.ruedas = ruedas;
	}
	public String getTipo() {
		return tipo;
	}
	public static int getCantidadMotos() {
		return cantidadMotos;
	}
	public static void setCantidadMotos(int cantidadMotos) {
		Moto.cantidadMotos = cantidadMotos;
	}
	@Override
	public Persona verPersonasFueraDeVehiculos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Persona verPersonasDentroDeVehiculos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String verVehiculoesDisponiblesYSusDatos() {
		// TODO Auto-generated method stub
		return tipo + "s Disponibles: "+cantidadMotos + ", Peso: "+Float.toString(peso) + " Kilogramos Disponibles, " + "Plazas: "+ plazas +" disponibles";
	}

	@Override
	public Vehiculo SubirPersonaAVehiculo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vehiculo BajarPersonaDeVehiculo() {
		// TODO Auto-generated method stub
		return null;
	}
	
		
}
