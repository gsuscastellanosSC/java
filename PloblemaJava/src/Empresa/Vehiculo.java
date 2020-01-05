package Empresa;

import java.util.ArrayList;

public interface Vehiculo {
	public static java.util.List Vehiculos = new ArrayList();
	void verPesonasDentroVehiculos();
	void VerDisponibilidad();
	public boolean Subir(String NombrePersona, String NombreVehiculo);
	public void bajar(String NombrePersona, String NombreVehiculo);
			
}
