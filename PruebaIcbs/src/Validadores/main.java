package Validadores;

public class main {

	public static void main(String[] args) {
		IcbsValidator campo = new IcbsUpperCaseValidator();
		
		System.out.println(campo.validate("jesus"));
		
	}
		

}
