package test.java;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;
import gt.edu.umes.proy.calculo.LogicaDelNegocio;

class CalculoSegundosTest {

	@Test
	void pruebadeDatosConLetras() {
		LogicaDelNegocio logica = new LogicaDelNegocio();
		String[] datos = {"1", "3", "a", "20", "1"};

		assertFalse(logica.Validacion(datos));
		assertThrows(NumberFormatException.class, () -> logica.CalcularSegundos(datos));
	}

	@Test
	void pruebaCalculoDeSegundos() {
		LogicaDelNegocio logica = new LogicaDelNegocio();
		String[] datos = {"1", "3", "6", "20", "1"};

		assertEquals(4996860L, logica.CalcularSegundos(datos));
	}
}