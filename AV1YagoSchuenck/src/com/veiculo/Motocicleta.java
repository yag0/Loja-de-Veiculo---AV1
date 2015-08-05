package com.veiculo;

import com.enumeracao.*;

public class Motocicleta extends Veiculo{
	private int cilindrada;
	private int capacidade;
	
	public Motocicleta(){}
	
	public Motocicleta(String chassi, Montadora montadora, String modelo, String tipo, Cor cor, float preco, int cilindrada, int capacidade) {
		super(chassi, montadora, modelo, tipo, cor, preco);
		
		this.setCilindrada(cilindrada);
		this.setCapacidade(capacidade);
	}
	
	public int getCilindrada() {
		return cilindrada;
	}
	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}
	public int getCapacidade() {
		return capacidade;
	}
	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}	
}
