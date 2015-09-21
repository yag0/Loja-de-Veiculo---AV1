package com.model.veiculo;

public class FactoryVeiculo {	
	
	public static Veiculo getVeiculo(int opcaoVeiculo){		
		
		if(opcaoVeiculo == 1)		
			return new Carro();	
		else if(opcaoVeiculo == 2)
			return new Motocicleta();	
		else
			return null;
	}
}
