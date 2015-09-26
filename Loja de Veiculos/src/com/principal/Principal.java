package com.principal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import com.model.enumeracao.*;
import com.model.loja.Loja;
import com.model.veiculo.Veiculo;

public class Principal {

	public static void main(String[] args) {
		Loja loja = new Loja();		
		
		Veiculo veiculo1 = new Veiculo();
				
		Veiculo veiculo2 = new Veiculo();
		
		Veiculo veiculo3 = new Veiculo();		
			
		//Cria um veiculo e adiciona na lista de estoque
		veiculo1.setTipoVeiculo(TipoVeiculo.CARRO);
		veiculo1.setChassi("1B798EC0000000547");
		veiculo1.setPreco(20000);
		veiculo1.setEspecificacao("Montadora", "Renault");
		veiculo1.setEspecificacao("Tipo", "Esportivo");
		veiculo1.setEspecificacao("Motorizacao", 2.0);
		veiculo1.setEspecificacao("Cor", "Branco");
		veiculo1.setEspecificacao("Cambio", "Manual");		
		loja.adicionarVeiculo(veiculo1);
		
		//Cria um veiculo e adiciona na lista de estoque
		veiculo2.setTipoVeiculo(TipoVeiculo.MOTOCICLETA);
		veiculo2.setChassi("2C748BB5000000907");
		veiculo2.setPreco(10000);
		veiculo2.setEspecificacao("Montadora", "Honda");
		veiculo2.setEspecificacao("Tipo", "Esportivo");
		veiculo2.setEspecificacao("Cor", "Preta");
		veiculo2.setEspecificacao("Cilindrada", 600);
		veiculo2.setEspecificacao("Capacidade do Tanque", 4);
		loja.adicionarVeiculo(veiculo2);
		
		//Cria um veiculo e adiciona na lista de estoque
		veiculo3.setTipoVeiculo(TipoVeiculo.CARRO);
		veiculo3.setChassi("1SOJ4O3JN00000034");
		veiculo3.setPreco(40000);
		veiculo3.setEspecificacao("Montadora", "Hyundai");
		veiculo3.setEspecificacao("Tipo", "Esportivo");
		veiculo3.setEspecificacao("Motorizacao", 3.0);
		veiculo3.setEspecificacao("Cor", "Prata");
		veiculo3.setEspecificacao("Cambio", "Automatico");		
		loja.adicionarVeiculo(veiculo3);		
		
		//Lista o estoque completo 
		loja.listarEstoque();
		
		//Intancia de um mapa para a pesquisa
		Map<String, Object> mapaDePesquisa = new HashMap<String, Object>();		
		//Atribui as chaves e os valores de pesquisa ao mapa
		mapaDePesquisa.put("Montadora", "Hyundai");
		mapaDePesquisa.put("Cor", "Prata");
		mapaDePesquisa.put("Tipo", "Esportivo");
		
		//Apos a pesquisa ser feita, uma lista de veiculos e retornada
		ArrayList<Veiculo> resultadoDeVeiculos = loja.pesquisarVeiculo(mapaDePesquisa);
		loja.listarEstoque(resultadoDeVeiculos);			
		
		//Uma busca por chassi, retornando o veiculo caso tenha sido encontrado
		Veiculo veiculoDeBusca = loja.buscarVeiculo("2C748BB5000000907");		
		loja.listarEstoque(veiculoDeBusca);			
	}
}
