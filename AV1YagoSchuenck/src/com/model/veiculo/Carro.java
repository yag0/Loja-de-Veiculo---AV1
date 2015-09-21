package com.model.veiculo;

import com.enumeracao.*;

public class Carro extends Veiculo{
	private float motorizacao;
	private Cambio cambio;
	
	public Carro(){}
	
	public Carro(String chassi, Montadora montadora, String modelo, Tipo tipo, Cor cor, float preco, float motorizacao, Cambio cambio){
		super(chassi, montadora, modelo, tipo, cor, preco);	
		this.setMotorizacao(motorizacao);
		this.setCambio(cambio);
	}
	
	public float getMotorizacao() {
		return motorizacao;
	}
	public void setMotorizacao(float motorizacao) {
		this.motorizacao = motorizacao;
	}
	public Cambio getCambio() {
		return cambio;
	}
	public void setCambio(Cambio cambio) {
		this.cambio = cambio;
	}
	
	/*@Override
	public boolean equals(Object carro){
		if(carro instanceof Carro){}
		
			return false;
	}*/
}
