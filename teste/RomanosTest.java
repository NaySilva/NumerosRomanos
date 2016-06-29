import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.edu.ifpi.numeros.modelo.ConversorRomanos;

public class RomanosTest {
	
	ConversorRomanos cr;
	
	@Before
	public void Inicio(){
		cr = new ConversorRomanos();
	}

	@Test
	public void Deve_Converter_Valores_Simples() {
		assertEquals(1, cr.converter("I"));
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void Deve_Retornar_Erro_Valor_Invalido(){
		cr.converter("R");
		cr.converter("XF");
	}
		
	@Test
	public void Deve_Converter_Valores_Composto_Ordenados(){
		assertEquals(20, cr.converter("XX"));
		
	}
	
	@Test
	public void Deve_Converter_Valores_Composto_Desordenados(){
		assertEquals(9, cr.converter("IX"));
		
	}
	

}
