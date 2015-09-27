package com.model.veiculo;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import com.model.enumeracao.TipoVeiculo;

public class Veiculo{	
	private TipoVeiculo tipoVeiculo;
	private String chassi;
	private float preco;	
	private Map<String, Object> especificacao;		
	
	public Veiculo(){			
		especificacao = new HashMap<String, Object>();
	}
	
	public TipoVeiculo getTipoVeiculo(){
		return tipoVeiculo;
	}	
	
	public void setTipoVeiculo(TipoVeiculo tipoVeiculo){
		this.tipoVeiculo = tipoVeiculo;
	}
	
	public String getChassi() {
		return chassi;
	}
	
	public void setChassi(String chassi) {
		this.chassi = chassi;
	}
	
	public float getPreco() {
		return preco;
	}
	
	public void setPreco(float preco) {
		this.preco = preco;
	}	
	
	public void setEspecificacao(String key, Object value){
		especificacao.put(key, value);
	}
	
	public Map<String, Object> getEspecificacao(){
		return this.especificacao;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public boolean equals(Object object){
		
		if(object instanceof HashMap){
			for(Entry<String, Object> entry : ((Map<String, Object>) object).entrySet()){
				if(this.getEspecificacao().containsKey(entry.getKey()) && this.getEspecificacao().containsValue(entry.getValue())){
					return true;
				}		
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		int hash = 0;		

		for(Entry<String, Object> entry : this.getEspecificacao().entrySet()){						
			hash += entry.getValue().toString().length();
		}		
		return hash;
	}
	
	//Verifica se os dados passados pelo usuario constam no Enum
	//Caso nao esteja contido no enum ele gera uma menssagem de erro abortando o sistema
	public <T extends Enum<T>> String verificar(Class<T> enumClass, String input){		
				
		for(Enum<T> item : enumClass.getEnumConstants()){		
			if(item.name().equalsIgnoreCase(input)){
				return item.toString();
			}			
		}
		System.err.println("Does not check");
		System.exit(0);
		return null;
	}	
}
