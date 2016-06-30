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
	public void Deve_Retornar_Erro_Letra_Invalida_De_Numero_Simples(){
		cr.converter("R");
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void Deve_Retornar_Erro_Letra_Invalida_De_Numero_Composto(){
		cr.converter("CF");
	}
		
	@Test
	public void Deve_Converter_Valores_Composto_Ordenados(){
		assertEquals(30, cr.converter("XXX"));
		
	}
	
	@Test
	public void Deve_Converter_Valores_Composto_Desordenados(){
		assertEquals(109, cr.converter("CIX"));
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void Deve_Retornar_Erro_Por_Letras_Em_Sequencia_Maior_Que_3(){
		cr.converter("XXXX");
	}
	

	

}
