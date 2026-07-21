package JamesBank;

public class Conta  {
	
	private int agencia;
	private double saldo;
	protected Cliente titular;

	public Conta(int agencia, Cliente titular) {
		this.agencia = agencia;
		this.titular = titular;
		this.saldo = 0.0;
		
	}

	public void depositar(double deposito) {
		System.out.println("\n===========================");
		System.out.println("Deposito de R$" + deposito + 
				"\nRealizado com Sucesso!!!");
		this.setSaldo(this.getSaldo() + deposito);
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
			System.out.println("----------------------------");
			System.out.println("Saldo atual: R$" + getSaldo());
			System.out.println("=============================\n");
		}

	}

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

	} 

	public void exibirExtrato() {
		System.out.println("\nE X T R A T O   B A N C Á R I O ");
		System.out.println("----------------------------------");
		System.out.println("Cliente: " +this.titular.getNome());
		System.out.println("Banco: JAMES BANK ");
		System.out.println("Agência: " +this.getAgencia());
		System.out.println("----------------------------------\n");
		System.out.println("SALDO ATUAL:                 R$"+this.getSaldo());	
		System.out.println("----------------------------------\n");

	}
	
	public void exibirDados() {
		System.out.println("\n=========================");
		System.out.println(" I N F O R M A Ç Õ E S");
		System.out.println("=========================");
		System.out.println("Cliente: " +this.titular.getNome());
		System.out.println("CPF: " +this.titular.getCpf());
		System.out.println("Telefone: " +this.titular.getTelefone());
		System.out.println("Saldo: R$" +this.getSaldo());
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

}
