package JamesBank;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		Banco jamesBank = new Banco ("Contas JAMES BANK");
		
		Scanner sc = new Scanner (System.in);
		System.out.println("\n=======================");
		System.out.println("BEM-VINDO AO JAMES BANK!");
		System.out.println("=======================\n");
		
		
		int opcaoInicial = 0;
		
		//MENU INICIAL DO BANCO 
		while(opcaoInicial != 3) {
			System.out.println("\n---- MENU PRINCIPAL ----");
			System.out.println("[1] - Cadastrar Nova Conta");
			System.out.println("[2] - Acessar Conta (Login)");
			System.out.println("[3] - Encerrar sessão...");
			System.out.println("---------------------------");
			System.out.println(">>>Escolha sua opção: ");
			opcaoInicial = sc.nextInt();
			sc.nextLine(); //Limpar o "Enter" da memoria do teclado
		
		
			switch (opcaoInicial) {
				case 1:
			
					System.out.println("\n--- TELA DE CADASTRO ---"); 
					System.out.print("> Digite seu nome: ");
					String nome = sc.nextLine();
		
					System.out.print("> Digite seu CPF: ");
					String cpf = sc.nextLine();
		
					System.out.print("> Digite seu numero de telefone: ");
					String telefone = sc.nextLine();
				
					//CADASTRO DA CONTA 
					Cliente novoCliente = new Cliente(nome, cpf, telefone);
					Conta contaLogada = new Conta(1010, novoCliente ); 
			
					//Salva conta na Lista do Banco
					jamesBank.adicionarConta(contaLogada);
					break;
				case 2:
					System.out.println("\n--- TELA DE LOGIN ---");
                    System.out.print(">>> Digite seu CPF para acessar: ");
                    String buscaCpf = sc.nextLine();
                    
                    // O banco procura se o CPF existe na Lista
                    Conta contaLogada1 = jamesBank.buscarContaCpf(buscaCpf);
                    
                    if (contaLogada1 != null) {
						System.out.println("\n Login realizado com sucesso!");
						System.out.println("Bem-vido(a), "+contaLogada1.getTitular().getNome());
						
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
									System.out.println("\nSaldo disponível: R$" + contaLogada1.getSaldo());
									System.out.println("----------------------------");
									System.out.print("Digite o valor para depósito: R$");
									double valorDep = sc.nextDouble();
									contaLogada1.depositar(valorDep);
									break;
									
								case 2:
									System.out.println("\nSaldo disponível: R$" + contaLogada1.getSaldo());
									System.out.println("----------------------------");
									System.out.print("Digite o valor para saque: R$");
									double valorSaq = sc.nextDouble();
									contaLogada1.sacar(valorSaq);
									break;
									
								case 3: 
									contaLogada1.exibirExtrato();
									break;
									
								case 4:
									contaLogada1.exibirDados();
									break;
									
								case 5:
									System.out.println("Sainda da Conta...Retornando ao Menu Principal.");
									System.out.println("Sessão finalizada, até logo...");
									break;
								
								default:
									System.out.println("Opção Invalida");
									}	
								} 
                    }else {
                    	System.out.println("\n[ERRO] Nenhuma conta encontrada com o CPF: " + buscaCpf);
                    }
                    break;
                    
				case 3:
                    System.out.println("\nEncerrando o James Bank. Volte sempre!");
                    break;

                default:
                    System.out.println("\n [ERRO] Opção inválida!");
			}        
		}
	sc.close();
	
	}

}
