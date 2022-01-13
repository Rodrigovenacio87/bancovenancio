
package bancovenancio;

import java.util.Locale;

public class CriaConta {
	
	public static void main(String[] args) {
		
		//essa classe é o objeto, objeto do tipo conta 
		Conta primeiraConta = new Conta();
		primeiraConta.Saldo = 200;
		System.out.println(primeiraConta.Saldo);
		
		primeiraConta.Saldo +=100;
		System.out.println(primeiraConta.Saldo);
		
		//primeiraConta.Saldo -=100;
		//System.out.println(primeiraConta.Saldo);
		
		// Criação da Segunda Conta
		Conta segundaConta = new Conta();
		segundaConta.Saldo = 50;
		
		// Criação terceira Conta
		Conta terceiraConta = new Conta();
		terceiraConta.Saldo = 1000;
		
		System.out.println("Seu Saldo Disponível na conta 1 é:" +"R$"  + primeiraConta.Saldo);
		System.out.println("Seu Saldo Disponível na conta 2 é:" +"R$"  + segundaConta.Saldo);
		System.out.println("Seu Saldo Disponível na conta 3 é:" +"R$"  + terceiraConta.Saldo);
		
	}

}
