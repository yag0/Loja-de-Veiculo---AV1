package com.view;

import java.util.Scanner;
import com.model.veiculo.*;
import com.enumeracao.*;

public class Input{
	
	private <T extends Enum<T>> String verificarEnum(Class<T> enumClass, String code){
		for(Enum<T> item : enumClass.getEnumConstants())
			if(item.name().equalsIgnoreCase(code))				
				return item.toString();
		return "Erro";
	}
	
	public Veiculo inputVeiculo(Carro carro){
		String chassi, montadora, modelo, tipo, cor, cambio;
		float motorizacao, preco;		
		
		Scanner input = new Scanner(System.in);
		System.out.println("Entre com chassi do carro: ");
		chassi = input.nextLine();
		carro.setChassi(chassi);
		System.out.println("Entre com montadora do carro: ");
		montadora = input.nextLine();
		Montadora m = Montadora.valueOf(verificarEnum(Montadora.class, montadora));
		carro.setMontadora(m);
		System.out.println("Entre com a modelo do carro: ");
		modelo = input.nextLine();
		carro.setModelo(modelo);
		System.out.println("Entre com o tipo do carro: ");
		tipo = input.nextLine();
		Tipo t = Tipo.valueOf(verificarEnum(Tipo.class, tipo));
		carro.setTipo(t);
		System.out.println("Entre com o cor do carro: ");
		cor = input.nextLine();
		Cor cr = Cor.valueOf(verificarEnum(Cor.class, cor));
		carro.setCor(cr);
		System.out.println("Entre com o cambio do carro: ");
		cambio = input.nextLine();
		Cambio c = Cambio.valueOf(verificarEnum(Cambio.class, cambio));
		carro.setCambio(c);
		System.out.println("Entre com a motorizacao: ");
		motorizacao = input.nextFloat();
		carro.setMotorizacao(motorizacao);				
		System.out.println("Entre com a preco: ");
		preco = input.nextFloat();
		carro.setPreco(preco);
		input.close();			
	
		return carro;
	}	
	
	public Motocicleta inputVeiculo(Motocicleta moto){return null;}
}	

	
