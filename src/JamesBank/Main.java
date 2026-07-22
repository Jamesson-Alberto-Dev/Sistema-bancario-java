package JamesBank;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente("Jamesson Alberto", "000.000.000-00", "(85)99999-9999");
		Conta conta1 = new Conta(1010, cliente1 ); 
		
		Scanner sc = new Scanner (System.in);
		int opcao = 0;
		
	while (opcao != 5) {
		System.out.println("\n---- SISTEMA BANCARIO ----");
		System.out.println("[1] - Depositar");
		System.out.println("[2] - Sacar");
		System.out.println("[3] - Extrato da Conta");
		System.out.println("[4] - Informações da Conta");
		System.out.println("[5] - Sair da Conta");
		System.out.println("-----------------------------");
		System.out.print("Escolha sua opção: ");
		
		opcao = sc.nextInt(); //ler a opçao digitada
		
		switch (opcao) {
			case 1:
				System.out.print("Digite o valor para depósito: R$");
				double valorDep = sc.nextDouble();
				conta1.depositar(valorDep);
				break;
				
			case 2:
				System.out.print("Digite o valor para saque: R$");
				double valorSaq = sc.nextDouble();
				conta1.sacar(valorSaq);
				break;
				
			case 3: 
				conta1.exibirExtrato();
				break;
				
			case 4:
				conta1.exibirDados();
				break;
				
			case 5:
				System.out.println("Obrigado por usar o JAMES BANK");
				System.out.println("Sessão finalizada, até logo...");
				break;
			
			default:
				System.out.println("Opção Invalida");
			}
	
		
		}
	sc.close();
	}

}
