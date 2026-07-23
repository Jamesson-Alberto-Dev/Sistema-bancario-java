package JamesBank;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
	
		Scanner sc = new Scanner (System.in);
		System.out.println("\n=======================");
		System.out.println("BEM-VINDO AO JAMES BANK!");
		System.out.println("=======================\n");
		
		System.out.print("> Digite seu nome: ");
		String nome = sc.nextLine();
		
		System.out.print("> Digite seu CPF: ");
		String cpf = sc.nextLine();
		
		System.out.print("> Digite seu numero de telefone: ");
		String telefone = sc.nextLine();
		
		//CADASTRO DA CONTA 
		Cliente cliente1 = new Cliente(nome, cpf, telefone);
		Conta conta1 = new Conta(1010, cliente1 ); 
	
		System.out.println("\n#### Conta de [" +cliente1.getNome()+ "] cadastrada com sucesso!!!\n");
		
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
				System.out.println("\nSaldo disponível: R$" + conta1.getSaldo());
				System.out.println("----------------------------");
				System.out.print("Digite o valor para depósito: R$");
				double valorDep = sc.nextDouble();
				conta1.depositar(valorDep);
				break;
				
			case 2:
				System.out.println("\nSaldo disponível: R$" + conta1.getSaldo());
				System.out.println("----------------------------");
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
