package com.view.input;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.model.enumeracao.*;
import com.model.veiculo.Veiculo;

public class DisplayVeiculo {		
	
	public void criaCarro(Veiculo veiculo){		
		String chassi, modelo;
		Montadora montadora;
		Cor cor;
		Tipo tipo;
		Cambio cambio;
		float motorizacao, preco;
		
		Scanner input = new Scanner(System.in);
		
		try{
			System.out.println("Entre com o chassi: ");
			chassi = input.nextLine();
			veiculo.setChassi(chassi);
			System.out.println("Entre com a montadora: ");
			montadora = Montadora.valueOf(verificar(Montadora.class, input.nextLine()));
			veiculo.setEspecificacao("Montadora", montadora);
			System.out.println("Entre com o modelo: ");
			modelo = input.nextLine();
			veiculo.setEspecificacao("Modelo", modelo);
			System.out.println("Entre com o tipo: ");		
			tipo = Tipo.valueOf(verificar(Tipo.class, input.nextLine()));
			veiculo.setEspecificacao("Tipo", tipo);
			System.out.println("Entre com a cor: ");
			cor = Cor.valueOf(verificar(Cor.class, input.nextLine()));
			veiculo.setEspecificacao("Cor", cor);
			System.out.println("Entre com a motorizacao: ");
			motorizacao = input.nextFloat();
			input.nextLine();
			veiculo.setEspecificacao("Motorizacao", motorizacao);
			System.out.println("Entre com o cambio: ");
			cambio = Cambio.valueOf(verificar(Cambio.class, input.nextLine()));		
			veiculo.setEspecificacao("Cambio", cambio);		
			System.out.println("Entre com o preco: ");
			preco = input.nextFloat();
			veiculo.setPreco(preco);
		}
		catch(InputMismatchException e){
			e.printStackTrace();
			System.exit(0);
		}
		input.close();
	}
	
	public void criaMoto(Veiculo veiculo){
		String chassi, modelo;
		Montadora montadora;
		Cor cor;
		Tipo tipo;
		float preco;
		int cilindrada, capacidadeDoTanque;
		
		Scanner input = new Scanner(System.in);
		
		try{
			System.out.println("Entre com o chassi: ");
			chassi = input.nextLine();
			veiculo.setChassi(chassi);
			System.out.println("Entre com a montadora: ");
			montadora = Montadora.valueOf(verificar(Montadora.class, input.nextLine()));
			veiculo.setEspecificacao("Montadora", montadora);
			System.out.println("Entre com o modelo: ");
			modelo = input.nextLine();
			veiculo.setEspecificacao("Modelo", modelo);
			System.out.println("Entre com o tipo: ");		
			tipo = Tipo.valueOf(verificar(Tipo.class, input.nextLine()));
			veiculo.setEspecificacao("Tipo", tipo);
			System.out.println("Entre com a cor: ");
			cor = Cor.valueOf(verificar(Cor.class, input.nextLine()));
			veiculo.setEspecificacao("Cor", cor);		
			System.out.println("Entre com a cilindrada: ");
			cilindrada = input.nextInt();
			veiculo.setEspecificacao("Cilindrada", cilindrada);
			System.out.println("Entre com a capacidade do tanque: ");
			capacidadeDoTanque = input.nextInt();
			veiculo.setEspecificacao("Capacidade do Tanque", capacidadeDoTanque);
			System.out.println("Entre com o preco: ");
			preco = input.nextFloat();
			veiculo.setPreco(preco);
		}
		catch(InputMismatchException e){
			e.printStackTrace();
		}
		input.close();
	}
	
	public static void pesquisaCarro(){	
	
	}	
	
	private <T extends Enum<T>> String verificar(Class<T> enumClass, String code){		
		for(Enum<T> item : enumClass.getEnumConstants())		
			if(item.name().equalsIgnoreCase(code))
				return item.toString();			
		return "Erro";
	}
}
