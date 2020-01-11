package Empresa;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
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
	public Vehiculo SubirPersonaAVehiculo(String[] elements) {
		String nombrePersona = elements[0];
		String tipoVehiculo = elements[1];
		for (int i = 0; i < Menu.personas.size(); i++) {
			if(Menu.personas.get(i).getNombre().equalsIgnoreCase(nombrePersona)) {
				for (int j = 0; j < Menu.vehiculos.size(); j++) {
					if(Menu.vehiculos.get(j).getTipoVehiculo().equalsIgnoreCase(tipoVehiculo)) {
						Menu.vehiculos.get(j).setPeso(peso-Menu.personas.get(i).getPeso());
						System.out.println(Menu.vehiculos);
						j = Menu.vehiculos.size();
						//Falta construir la lógica de descuento de peso y plazas
						Menu.personasEnVehiculos.add(Menu.personas.get(i));//Subir al Vehiculo
						Menu.personas.remove(i); //Persona No disponible
					}
				}
				i = Menu.personas.size();
			}
		}
		return null;
}
	@Override
	public Vehiculo BajarPersonaDeVehiculo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getTipoVehiculo() {
		// TODO Auto-generated method stub
		return tipo;
	}

	@Override
	public int getCapacidad() {
		// TODO Auto-generated method stub
		return capacidad;
	}

	@Override
	public float getPeso() {
		// TODO Auto-generated method stub
		return peso;
	}

	@Override
	public int getPlazas() {
		// TODO Auto-generated method stub
		return plazas;
	}

	@Override
	public int getRuedas() {
		// TODO Auto-generated method stub
		return ruedas;
	}

	@Override
	public void setPeso(float peso) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	@Override
	public void setPlazas(int plazas) {
		this.plazas = plazas;
	}

	@Override
	public void setRuedas(int ruedas) {
		this.ruedas = ruedas;
	}
}
