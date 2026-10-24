package gt.edu.umes.proy.calculo;

public class LogicaDelNegocio {
public static final int Cant_Parametro= 5;
public static final int Dias_Por_Mes = 30;
public static final int Dias_Semana = 7;
public static final int Segundos_Por_Dia = 86400;
public static final int Segundos_Por_Horas = 3600;
public static final int Segundos_Por_Minuto = 60 ;


public boolean Validacion(String[] args) {
	if (args == null ||args.length != Cant_Parametro ) {
		return false;
	}
	for (int indice = 0; indice <args.length; indice++) {
		try {
			Integer.parseInt(args[indice]);
			
		}catch (NumberFormatException e) {
			return false;
		}
	}
	return true;
}

public long CalcularSegundos(String[]args) {
long Meses = Long.parseLong(args[0]);
long Semanas = Long.parseLong(args[1]);
long Dias = Long.parseLong(args[2]);
long Horas = Long.parseLong(args[3]);
long Minutos = Long.parseLong(args[4]);

long TotalDias = Meses * Dias_Por_Mes + Semanas * Dias_Semana + Dias;
long Segundos = TotalDias * Segundos_Por_Dia + Horas * Segundos_Por_Horas + Minutos *Segundos_Por_Minuto;
return Segundos;
}

}
