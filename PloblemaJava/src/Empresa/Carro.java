package Empresa;

public class Carro implements Vehiculo{
	
	private final String tipo;
	private int capacidad; 
	private float peso; 
	private int plazas; 
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

	private int ruedas;
	private static int cantidadCarros = 0;
	
	public Carro(int capacidad, float peso, int plazas, int ruedas) {
		this.tipo = "Carro";
		this.capacidad = capacidad;
		this.peso = peso;
		this.plazas = plazas;
		this.ruedas = ruedas;
		cantidadCarros++;
	}
	@Override
	public Persona verPersonasFueraDeVehiculos() {
		// TODO Auto-generated method stub
		return null;
	}

	public static int getCantidadCarros() {
		return cantidadCarros;
	}
	public static void setCantidadCarros(int cantidadCarros) {
		Carro.cantidadCarros = cantidadCarros;
	}
	@Override
	public Persona verPersonasDentroDeVehiculos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String verVehiculoesDisponiblesYSusDatos() {
		// TODO Auto-generated method stub
		return tipo + "s Disponibles: "+cantidadCarros + ", Peso: "+Float.toString(peso) + " Kilogramos Disponibles, " + "Plazas: "+ plazas +" disponibles";
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
