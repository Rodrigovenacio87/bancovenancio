package bancovenancio;

public class TesteReferencias {
	
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.Saldo = 200;
		
		System.out.println("Saldo da primeira:" + primeiraConta.Saldo);
		
		Conta segundaConta = primeiraConta; 	  	
		
		
		
	}

}
