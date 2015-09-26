package com.view.input;

import java.util.InputMismatchException;
import java.util.Scanner;
import com.model.enumeracao.Cor;
import com.model.enumeracao.Montadora;
import com.model.enumeracao.TipoMoto;
import com.model.veiculo.Veiculo;

public class DisplayMoto implements Criavel{
	
	public void criarVeiculo(Veiculo veiculo){
		String chassi, modelo;
		Montadora montadora;
		Cor cor;
		TipoMoto tipoMoto;
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
			tipoMoto = TipoMoto.valueOf(verificar(TipoMoto.class, input.nextLine()));
			veiculo.setEspecificacao("Tipo", tipoMoto);
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
			System.err.print("Incorrect type");
			System.exit(0);
		}
		catch(Exception e){
			e.printStackTrace();
			System.exit(0);
		}
		finally{
			input.close();
		}
	}
	
	private <T extends Enum<T>> String verificar(Class<T> enumClass, String input){		
		
		for(Enum<T> item : enumClass.getEnumConstants())		
			if(item.name().equalsIgnoreCase(input))
				return item.toString();
		
		System.err.println("Does not check");
		System.exit(0);
		return null;
	}
}
