
package bancovenancio;

import java.util.Locale;

public class CriaConta {
	
	public static void main(String[] args) {
		
		//essa classe � o objeto, objeto do tipo conta 
		Conta primeiraConta = new Conta();
		primeiraConta.Saldo = 200;
		System.out.println(primeiraConta.Saldo);
		
		primeiraConta.Saldo +=100;
		System.out.println(primeiraConta.Saldo);
		
		//primeiraConta.Saldo -=100;
		//System.out.println(primeiraConta.Saldo);
		
		// Cria��o da Segunda Conta
		Conta segundaConta = new Conta();
		segundaConta.Saldo = 50;
		
		// Cria��o terceira Conta
		Conta terceiraConta = new Conta();
		terceiraConta.Saldo = 1000;
		
		System.out.println("Seu Saldo Dispon�vel na conta 1 �:" +"R$"  + primeiraConta.Saldo);
		System.out.println("Seu Saldo Dispon�vel na conta 2 �:" +"R$"  + segundaConta.Saldo);
		System.out.println("Seu Saldo Dispon�vel na conta 3 �:" +"R$"  + terceiraConta.Saldo);
		
	}

}
