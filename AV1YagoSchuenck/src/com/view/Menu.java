package com.view;

import java.util.Scanner;
import com.model.veiculo.*;
import com.model.loja.*;

public class Menu {
	
	public void displayMenu(){
		int opcaoMenu, opcaoVeiculo;
		Veiculo veiculo;
		Loja loja = new Loja();
		Scanner input = new Scanner(System.in);			
			
		System.out.println("1 - Adicionar Veiculo");			
		System.out.println("2 - Pesquisar Veiculo");			
		System.out.println("3 - Buscar Veiculo");			
		System.out.println("4 - Listar Veiculo");			
		System.out.println("5 - Sair");
		System.out.print("\nOpcao: ");
		opcaoMenu = input.nextInt();
		System.out.println("\n1 - Carro");
		System.out.println("2 - Moto");
		System.out.print("\nOpcao: ");
		opcaoVeiculo = input.nextInt();	
		
		switch(opcaoMenu){
			case 1:
				veiculo = criarVeiculo(opcaoVeiculo);
				loja.adicionarVeiculo(veiculo);
				break;
			case 2:
				loja.pesquisarVeiculo();
				break;
			case 3:
				loja.buscarVeiculo("teste");
				break;
			case 4:
				loja.listarEstoqueVeiculo();
				break;
			case 5: 
				System.exit(0);
			default:
				
		}
		input.close();
	}
	
	private Veiculo criarVeiculo(int opcaoVeiculo){		
		Input input = new Input();
		
		if(opcaoVeiculo == 1){		
			Carro carro = (Carro) FactoryVeiculo.getVeiculo(opcaoVeiculo);
			return input.inputVeiculo(carro);			
		}
		else if(opcaoVeiculo == 2){
			Motocicleta moto = (Motocicleta) FactoryVeiculo.getVeiculo(opcaoVeiculo);
			return input.inputVeiculo(moto);	
		}
		else{
			return null;
		}		
	}
}
