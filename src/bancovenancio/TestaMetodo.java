package bancovenancio;

public class TestaMetodo {
	
	public static void main(String[] args) {
		Conta contaDoRodrigo = new Conta();
		contaDoRodrigo.Saldo = 200;
		contaDoRodrigo.deposito(50);
		System.out.println(contaDoRodrigo.Saldo);
		
		boolean conseguiuRetirar = contaDoRodrigo.saca(100);
		System.out.println(contaDoRodrigo.Saldo);
		System.out.println(conseguiuRetirar);
		
		
		Conta contaDoVenancio = new Conta();
		contaDoVenancio.deposito(1000);
		
		contaDoVenancio.transferencia(300, contaDoRodrigo);
		System.out.println(contaDoVenancio.Saldo);
		System.out.println(contaDoRodrigo.Saldo);
		
		contaDoRodrigo.Titular = "Rodrigo Silva";
		System.out.println(contaDoRodrigo.Titular);
		
	}

}
	