package Validadores;

public class IcbsUpperCaseValidator implements IcbsValidator{
	
	@Override
	public boolean validate(String cadena){
		return cadena.equals(cadena.toUpperCase());
	}
	
	
}
