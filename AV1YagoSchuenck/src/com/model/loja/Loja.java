package com.model.loja;

import java.util.ArrayList;
import com.model.veiculo.Carro;
import com.model.veiculo.Veiculo;

public class Loja {
	private String endereco;
	private String nome;
	private ArrayList<Veiculo> estoqueVeiculo = new ArrayList<Veiculo>();	
	
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
	public ArrayList<Veiculo> getEstoqueVeiculo() {
		return estoqueVeiculo;
	}
	public void setEstoqueVeiculo(Veiculo veiculo) {
		estoqueVeiculo.add(veiculo);		
	}	
	
	public void adicionarVeiculo(Veiculo veiculo){
		this.setEstoqueVeiculo(veiculo);		
	}	
		
	public void pesquisarVeiculo(){}

	public Veiculo buscarVeiculo(String chassi){
		for(Veiculo veiculo : this.getEstoqueVeiculo())
			if(veiculo.getChassi().equals(chassi))
				return veiculo;		
		return null;
	}	
	
	public void listarEstoqueVeiculo(){
		for(Veiculo veiculo : this.getEstoqueVeiculo()){
			Carro carro = (Carro) veiculo;
			System.out.println("Chassi: " + carro.getChassi());
			System.out.println("Montadora" + carro.getMontadora());
			System.out.println("Modelo: " + carro.getModelo());
			System.out.println("Tipo: " + carro.getTipo());
			System.out.println("Cor: " + carro.getCor());
			System.out.println("Motorizacao: " + carro.getMotorizacao());						
			System.out.println("Cambio: " + carro.getCambio());
			System.out.println("Preco: " + carro.getPreco());			
		}
	}
}
