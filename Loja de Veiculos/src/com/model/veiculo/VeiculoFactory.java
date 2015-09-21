package com.model.veiculo;

import com.model.enumeracao.TipoVeiculo;
import com.view.input.DisplayVeiculo;

public class VeiculoFactory {
	
	
	public static Veiculo criarVeiculo(TipoVeiculo tipo) {
		DisplayVeiculo display = new DisplayVeiculo();
		Veiculo veiculo = new Veiculo();

		switch (tipo) {
		case CARRO:
			display.criaCarro(veiculo);
			break;
		case MOTOCICLETA:
			display.criaMoto(veiculo);
			break;
		default:
			veiculo = null;;
			break;
		}
		return veiculo;
	}
}	
