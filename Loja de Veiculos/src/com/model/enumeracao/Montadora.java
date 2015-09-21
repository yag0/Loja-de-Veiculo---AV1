package com.model.enumeracao;

public enum Montadora {
	YAMAHA(1, "yamaha"), BMW(2, "bmw"), SUZUKI(3, "suzuki"),
	HARLEY(4, "harley"), RENAULT(5, "renault"),
	CHEVROLET(6, "chevrolet"), FIAT(7, "fiat"),
	HONDA(8, "honda"), HYUNDAI(9, "hyundai");
	
	private final int numMontadora;
	private final String nomeMontadora;
	
	private Montadora(int numMontadora, String nomeMontadora){
		this.numMontadora = numMontadora;
		this.nomeMontadora = nomeMontadora;
	}
	
	public int getNumMontadora(){
		return numMontadora;
	}
	public String getNomeMontadora(){
		return nomeMontadora;
	}
}
