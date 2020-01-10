package Empresa;

import java.util.ArrayList;
import java.util.List;

public class Bicicleta implements Vehiculo{
	
	private final String tipo;
	private int capacidad; 
	private float peso; 
	private int plazas; 
	private int ruedas;
	private static int cantidadBicicletas;
	
	public Bicicleta(int capacidad, float peso, int plazas, int ruedas){
		this.tipo = "Bicicleta";
		this.capacidad = capacidad;
		this.peso = peso;
		this.plazas = plazas;
		this.ruedas = ruedas;
		cantidadBicicletas++;
		
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
	
	public static int getCantidadBicicletas() {
		return cantidadBicicletas;
	}
	public static void setCantidadBicicletas(int cantidadBicicletas) {
		Bicicleta.cantidadBicicletas = cantidadBicicletas;
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
		
		return tipo + "s Disponibles: "+cantidadBicicletas + ", Peso: "+Float.toString(peso) + " Kilogramos Disponibles, " + "Plazas: "+ plazas +" disponibles";
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
