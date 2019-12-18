package Validadores;

public abstract class IcbsValidatorNull implements IcbsValidator{
	
	public final boolean validate(String cadena) {
		
//		boolean isOK = null != cadena;
//		isOK = isOK && doValidate(cadena);
		
		boolean isOK = true;
		
		if (cadena == null) {
			isOK = false;
		} else {
			isOK = doValidate(cadena);
		}
		
		return isOK;
	}
	
	protected abstract boolean doValidate(String cadena);

}
