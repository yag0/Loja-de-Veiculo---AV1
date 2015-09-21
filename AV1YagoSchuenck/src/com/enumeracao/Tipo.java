package com.enumeracao;

public enum Tipo {
	PERUA(1, "perua"), PICAPE(2, "picape"), ESPORTIVO(3,"esportivo"), SCOOTER(4, "scooter"), STREET(5,"street");
	
	private int numTipo;
	private String nomeTipo;
	
	private Tipo(int numTipo, String nomeTipo){
		this.numTipo = numTipo;
		this.nomeTipo = nomeTipo;
	}
	
	public int getNumTipo(){
		return numTipo;
	}
	
	public String getNomeTipo(){
		return nomeTipo;
	}
}
