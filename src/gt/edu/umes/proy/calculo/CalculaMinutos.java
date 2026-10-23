package gt.edu.umes.proy.calculo;

public class CalculaMinutos {
	public static void main(String[]args) {
		LogicaDelNegocio Logica = new LogicaDelNegocio();

		if(Logica.Validacion(args) == false) {
		System.out.println("Error: Por favor debe de ingresar  5 numeros enteros");
		return;
		}
		long Total = Logica.CalcularSegundos(args);
		System.out.println("Total en segundos: "+ Total);
	}

}
