package bytank;

public class CriaConta {
	
	public static void main (String[] args) {
		
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		System.out.println("Seu saldo: " + primeiraConta.saldo);
		
		primeiraConta.saldo += 100;
		System.out.println("Seu saldo: " + primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta;
		segundaConta.saldo = 50;
		
		System.out.println("Saldo primeira conta: " + primeiraConta.saldo);
		System.out.println("Saldo segunda conta: " + segundaConta.saldo);
		
		//Ver endereço de memoria do objeto
		System.out.println(primeiraConta);
	}

}
