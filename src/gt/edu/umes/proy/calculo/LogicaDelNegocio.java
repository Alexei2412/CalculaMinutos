package gt.edu.umes.proy.calculo;

public class LogicaDelNegocio {

	public static final int Cant_Parametro = 5;
	private int Dias_Por_Mes;
	private int Dias_Semana;
	private int Segundos_Por_Dia;
	private int Segundos_Por_Horas;
	private int Segundos_Por_Minuto;

	

	public LogicaDelNegocio(int diasPorMes, int diasSemana, 
			int segundosPorDia,
			int segundosPorHoras, 
			int segundosPorMinuto) {

		this.Dias_Por_Mes = diasPorMes;
		this.Dias_Semana = diasSemana;
		this.Segundos_Por_Dia = segundosPorDia;
		this.Segundos_Por_Horas = segundosPorHoras;
		this.Segundos_Por_Minuto = segundosPorMinuto;

	}

	public boolean Validacion(String[] args) {
		if (args == null || args.length != Cant_Parametro) {
			return false;
		}

	for (int indice = 0; indice < args.length; indice++) {
			try {
				Integer.parseInt(args[indice]);

			} catch (NumberFormatException e) {
				return false;
			}

		}

		return true;
	}

	

	public long CalcularSegundos(String[] args) {
		if (Validacion(args) == false) {
			throw new IllegalArgumentException("Se requieren 5 numeros enteros");
		}
		long Meses = Long.parseLong(args[0]);
		long Semanas = Long.parseLong(args[1]);
		long Dias = Long.parseLong(args[2]);
		long Horas = Long.parseLong(args[3]);
		long Minutos = Long.parseLong(args[4]);
		long TotalDias = Meses * Dias_Por_Mes + Semanas * Dias_Semana + Dias;
		long Segundos = TotalDias * Segundos_Por_Dia + Horas * Segundos_Por_Horas + Minutos * Segundos_Por_Minuto;
		return Segundos;
	}

}
