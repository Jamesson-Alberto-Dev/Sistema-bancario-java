package JamesBank;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Banco  {
	private String nome;
	private List <Conta> contas; //lista que guarda todos os Cadastros
	
	
	public Banco(String nome) {
		this.nome = nome;
		this.contas = new ArrayList<>();
	}
	
	//metodo para cadastrar a conta na lista do Banco
	public void adicionarConta(Conta novaConta) {
		this.contas.add(novaConta);
		System.out.println(">>>Parabens!!!");
		System.out.println("Cadastro de "+novaConta.titular.getNome()+ " foi registrado no sistema");
		
	}
	
	//metodo para buscar conta pelo CPF no usuario
	public Conta buscarContaCpf(String cpfDigitado) {
		 for (Conta c : contas) {
			 
			 //Verifica se o CPF da conta é igual ao quue o usuario digitou
			 if(c.getTitular().getCpf().equals(cpfDigitado)) {
				 return c;
			 }
		 }
		 return null; //Caso nao encontre ninguem com esse CPF
	}
	
	
	
	//metodo para ver a quantidade de contas no Sistema
	public int getTotalContas() {
		return this.contas.size();
		
	}
	
}
