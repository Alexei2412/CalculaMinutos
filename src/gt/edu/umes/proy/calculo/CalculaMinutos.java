package gt.edu.umes.proy.calculo;

public class CalculaMinutos {

	public static void main(String[] args) {

		LogicaDelNegocio Logica = new LogicaDelNegocio(30, 7, 86400, 3600, 60);
		if (Logica.Validacion(args) == false) {
		System.out.println("Error: Por favor debe de ingresar los 5 numeros enteros");
		return;
		}
		long Total = Logica.CalcularSegundos(args);
		System.out.println("Total de los segundos es: " + Total);
	}

}

