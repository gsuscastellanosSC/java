package Validadores;

public class IcbsUpperCaseValidator extends IcbsValidatorNull {

	@Override
	protected boolean doValidate(String cadena) {
		return cadena.equals(cadena.toUpperCase());
	}
	
	
}
