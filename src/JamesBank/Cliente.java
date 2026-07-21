package JamesBank;

public class Cliente {
	protected String nome;
	private String cpf;
	protected String telefone;
	private int idCliente = 0;


	//CONSTRUTOR
	public Cliente(String nome, String cpf, String telefone) {
		this.idCliente = idCliente++;
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
	
	}
	
	//GETS E SETS
	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
}
