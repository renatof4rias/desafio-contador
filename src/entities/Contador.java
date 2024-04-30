package entities;

import java.util.Scanner;

public class Contador {
	public static void main(String[] args) throws ParametrosInvalidosException {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
		
		
		
		try {
			
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException exception) {
			 throw new ParametrosInvalidosException("o segundo valor tem que ser maior que o primeiro ");
		}
		terminal.close();
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		
		
		int contagem = parametroDois - parametroUm;
	
	}

}