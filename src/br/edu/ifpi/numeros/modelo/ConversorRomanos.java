package br.edu.ifpi.numeros.modelo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ConversorRomanos {
	
	public int converter(String valor){
		
		maisDeTresRepeticoes(valor);
		
		int resultado = 0;
		int ultimo = 0;
		for (int i = valor.length()-1; i >= 0 ; i--) {
			Character letra = valor.charAt(i);
			if (ultimo <= valorDe(letra)){
				resultado += valorDe(letra);
			}else{
				resultado -= valorDe(letra);
			}
			ultimo = valorDe(letra);
		}
		
		return resultado;
	}

	private int valorDe(Character valor) {
		Map<Character, Integer> tabela = new HashMap<>();
		tabela.put('I', 1);
		tabela.put('V', 5);
		tabela.put('X', 10);
		tabela.put('L', 50);
		tabela.put('C', 100);
		tabela.put('D', 500);
		tabela.put('M', 1000);
		
		if(!tabela.containsKey(valor)){
			throw new IllegalArgumentException("Letra Invalida");
		}
		
		return tabela.get(valor);
	}
	
	private void maisDeTresRepeticoes(String valor){
		for (int i = 0; i < valor.length()-3; i++) {
			char letra = valor.charAt(i);
			String sequencia = "" + letra + letra + letra + letra;
			if (valor.length() >= i+4 && sequencia.equals(valor.substring(i, i+4)))
					throw new IllegalArgumentException("Valor Invalido");
		}
	}
	
}
