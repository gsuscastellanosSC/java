package validadores.impl;

import model.Persona;
import model.Vehiculo;
import validadores.ValidadorGestionVehiculo;

public class ValidadorPeso implements ValidadorGestionVehiculo {
	@Override
	public void validate(Vehiculo vehiculo, Persona persona) throws Exception {
		Double pesoActual = 0d;
		for (Persona p:vehiculo.getTripulantes()) {
			pesoActual += p.getPeso();
		}
		if (vehiculo.getPeso() < (pesoActual + persona.getPeso())) {
			throw new Exception("No es posible subir a la persona indicada porque supera el peso máximo del vehiculo");
		}
	}
}
