package com.model.veiculo;

import java.util.HashMap;
import java.util.Map;

public class Especificacao{	
	private Map<String, Object> especificacao;
	
	public Especificacao(){		
		especificacao = new HashMap<String, Object>();			
	}
	
	public void setEspecificacao(String key, Object value){
		this.especificacao.put(key, value);
	}
	
	public Map<String, Object> getEspecificacao(){
		return especificacao;
	}
}
