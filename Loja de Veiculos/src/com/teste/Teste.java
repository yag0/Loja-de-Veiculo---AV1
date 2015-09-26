package com.teste;
import com.model.loja.Loja;
import com.model.veiculo.Veiculo;
import com.view.input.Creatable;
import com.view.input.DisplayCarro;
import com.view.input.DisplayMoto;


public class Teste {
	
	public static void main(String[]args){
		Loja loja = new Loja();
		
		//Cria uma carro e lista o estoques
		Creatable create1 = new DisplayCarro();		
		Veiculo carro = new Veiculo();		
		create1.criarVeiculo(carro);		
		loja.adicionarVeiculo(carro);		
		loja.listarEstoque();		
		
		//Cria uma moto e lista o estoque
		Creatable create2 = new DisplayMoto();		
		Veiculo moto = new Veiculo();		
		create2.criarVeiculo(moto);		
		loja.adicionarVeiculo(moto);		
		loja.listarEstoque();			
		
	}
}
