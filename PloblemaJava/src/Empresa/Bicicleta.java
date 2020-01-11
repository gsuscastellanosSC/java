package Empresa;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Bicicleta implements Vehiculo{
	
	private final String tipo;
	private int capacidad; 
	private static float peso; 
	private static int plazas; 
	private int ruedas;
	private static int cantidadVehiculos;
	
	public Bicicleta(int capacidad, float peso, int plazas, int ruedas){
		this.tipo = "Bicicleta";
		this.capacidad = capacidad;
		this.peso = peso;
		this.plazas = plazas;
		this.ruedas = ruedas;
		cantidadVehiculos++;
		
	}
		
	public static int getcantidadVehiculos() {
		return cantidadVehiculos;
	}
	public static void setcantidadVehiculos(int cantidadVehiculos) {
		Bicicleta.cantidadVehiculos = cantidadVehiculos;
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
		
		return tipo + "s Disponibles: "+cantidadVehiculos + ", Peso: "+Float.toString(peso) + " Kilogramos Disponibles, " + "Plazas: "+ plazas +" disponibles";
	}

	@Override
	public Vehiculo SubirPersonaAVehiculo(String[] elements) {
		String nombrePersona = elements[0];
		for (int i = 0; i < Menu.personas.size(); i++) {
			if(Menu.personas.get(i).getNombre().equalsIgnoreCase(nombrePersona)) {
				if((peso > Menu.personas.get(i).getPeso() ) && (plazas > 0)){
					peso = peso - Menu.personas.get(i).getPeso();
					plazas--;
					if(plazas==0) {
						cantidadVehiculos--;
					}
					Menu.personasEnVehiculos.add(Menu.personas.get(i));
					Menu.personasEnVehiculos.get(Menu.personasEnVehiculos.size()-1).setTipoVehiculo(tipo);
					System.out.println(nombrePersona+" Ahora esta en "+elements[1]);
					Menu.personas.remove(i);
				}else {
					if(peso < Menu.personas.get(i).getPeso()) {
						System.out.println("El peso de la persona supera el peso del Vehiculo");
					}
					if(plazas == 0) {
						System.out.println("No hay plazas disponibles");
					}
					if(cantidadVehiculos==0) {
						System.out.println("No hay Vehículos disponibles");
				}
					System.out.println("La persona no se pude subir al Vehículo");
			}
				i = Menu.personas.size();
			}
		}
		return null;
}
	@Override
	public Vehiculo BajarPersonaDeVehiculo(String[] elements) {
		// TODO Auto-generated method stub
		String nombrePersona = elements[0];
		String tipoVe = elements[1];
		for (int i = 0; i < Menu.personasEnVehiculos.size(); i++) {
			if(Menu.personasEnVehiculos.get(i).getNombre().equalsIgnoreCase(nombrePersona) && tipoVe.equalsIgnoreCase(Menu.personasEnVehiculos.get(i).getTipoVehiculo())) {
				peso = peso + Menu.personasEnVehiculos.get(i).getPeso();
				if(plazas==0) {
					cantidadVehiculos++;
				}
				plazas++;
				Menu.personas.add(Menu.personasEnVehiculos.get(i));
				Menu.personasEnVehiculos.remove(i);
				i = Menu.personas.size();
			}
			else{
				System.out.println("Valide lo datos ingresados, no es posible bajar: " + nombrePersona + " del Vehículo: " + tipoVe);
			}
		}
		return null;
	}
}
