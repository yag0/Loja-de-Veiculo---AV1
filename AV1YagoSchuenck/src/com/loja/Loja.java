package com.loja;

import java.util.*;
import com.veiculo.*;

public class Loja {
	private String endereco;
	private String nome;
	private ArrayList<Carro> estoqueCarro = new ArrayList<Carro>();
	private ArrayList<Motocicleta> estoqueMoto = new ArrayList<Motocicleta>();
	
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public ArrayList<Carro> getEstoqueCarro() {
		return estoqueCarro;
	}
	public void setEstoqueCarro(Carro carro) {
			estoqueCarro.add(carro);
	}
	public ArrayList<Motocicleta> getEstoqueMoto() {
		return estoqueMoto;
	}
	public void setEstoqueMoto(Motocicleta moto) {
			this.estoqueMoto.add(moto);
	}

	public void adicionarCarro(){}	
	public void adicionarMoto(){}	
	public void pesquisaCarro(){}
	public void pesquisaMoto(){}
	public void buscarCarro(){}
	public void buscarMoto(){}	
	public void listarEstoqueCarro(){}
	public void listarEstoqueMoto(){}
}
