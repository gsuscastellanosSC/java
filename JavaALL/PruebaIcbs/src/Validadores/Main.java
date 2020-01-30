package Validadores;

public class Main {

	public static void main(String[] args) {
		IcbsValidator campo = new IcbsUpperCaseValidator();
		String texto = "UNo";

		System.out.println(campo.validate(texto));

	}

}
