package Validadores;

public class IcbslenghtValidator extends IcbsValidatorNull{
	int len=10;
	
	protected boolean doValidate(String cadena) {
		System.out.println(cadena.length());
		return cadena.length() <= len;
		}
}
