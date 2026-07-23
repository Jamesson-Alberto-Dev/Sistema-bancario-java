package JamesBank;
import java.util.ArrayList;
import java.util.List;

public class Conta  {
	
	private int agencia;
	private double saldo;
	protected Cliente titular;
	
	//atributo para guardar o histórico
	private List<String> historico;
	
	public Conta(int agencia, Cliente titular) {
		this.agencia = agencia;
		this.titular = titular;
		this.saldo = 0.0;
		this.historico = new ArrayList<>(); //inicia com a lista vazia
		
	}

	public void depositar(double deposito) {
		System.out.println("\n===========================");
		System.out.println("Deposito de R$" + deposito + 
				"\nRealizado com Sucesso!!!");
		this.setSaldo(this.getSaldo() + deposito);
		
		this.historico.add("Depósito: + R$" +deposito); //Guarda no ArrayList
		
		System.out.println("----------------------------");
		System.out.println("Saldo atual: R$" + getSaldo());
		System.out.println("=============================\n");


	}

	public void sacar(double saque) {
		if (this.getSaldo() < saque) {
			System.out.println("************************");
			System.out.println("Saldo insuficiente!!!");
			System.out.println("Saldo atual: R$" + this.getSaldo());
			System.out.println("************************");

		} else {
			this.setSaldo(this.getSaldo() - saque);
			System.out.println("\n===========================");
			System.out.println("Saque de R$" + saque + 
					"\nRealizado com Sucesso!!!");
			
			this.historico.add("Saque: - R$" +saque); //Guarda no ArrayList
			
			System.out.println("----------------------------");
			System.out.println("Saldo atual: R$" + getSaldo());
			System.out.println("=============================\n");
		}
	}
	
 /*
	 public void transferirViaPix(double transferencia, Conta destino) {
		if (this.getSaldo() < transferencia) {
			System.out.println("------Transferência Negada------");
			System.out.println("Saldo insuficiente!!!");

		} else {
			this.setSaldo(getSaldo() - transferencia);
			System.out.println("--------------------------------");
			System.out.println("Transferência realizada com sucesso!!!");
			System.out.println("Saldo atual: R$" + this.getSaldo());
		}
	} */

	public void exibirExtrato() {
		System.out.println("\n=================================");
		System.out.println("E X T R A T O   B A N C Á R I O ");
		System.out.println("----------------------------------");
		System.out.println("Cliente: " +this.titular.getNome());
		System.out.println("Banco: JAMES BANK ");
		System.out.println("Agência: " +this.getAgencia());
		System.out.println("----------------------------------");
		System.out.println(" M O V I M E N T A Ç Õ E S ");
		// Verifica se a Lista está vazia
		if (this.historico.isEmpty()) {
			System.out.println("Nenhuma transação realizada.");
			
		} else {
			for(String transacao : this.historico) {
				System.out.println(transacao); // vai pecorrer por todo o historico
				
			}

		}
		
		System.out.println("----------------------------------\n");
		System.out.println("SALDO ATUAL:                 R$"+this.getSaldo());	
		System.out.println("----------------------------------\n");
		System.out.println("==================================");
	}
	
	public void exibirDados() {
		System.out.println("\n=========================");
		System.out.println(" I N F O R M A Ç Õ E S");
		System.out.println("=========================");
		System.out.println("Cliente: " +this.titular.getNome());
		System.out.println("CPF: " +this.titular.getCpf());
		System.out.println("Telefone: " +this.titular.getTelefone());
		System.out.println("Saldo: R$" +this.getSaldo());
		System.out.println("Transações realizadas: "+this.historico.size());
		System.out.println("----------------------------");

	}
	
	
	
	// GETS E SETS
	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public List<String> getHistorico() {
		return historico;
	}

	public void setHistorico(List<String> historico) {
		this.historico = historico;
	}

}
