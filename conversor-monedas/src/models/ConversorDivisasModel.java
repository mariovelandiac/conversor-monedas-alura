package models;

import java.io.IOException;

import constants.InfoText;
import constants.OpcionesDivisas;
import constants.OptionList;
import strategies.ConversorStrategy;
import utils.OpcionesTexto;

public class ConversorDivisasModel {
	
	private String[] opciones;
	private String infoText;
	private ConversorStrategy strategy;
	
	public ConversorDivisasModel() {
		this.infoText = InfoText.ConvDivisas.getStringToShow();
		OptionList[] opcionesConversor = OpcionesDivisas.values();
		this.opciones = OpcionesTexto.getOpciones(opcionesConversor);
	}

	public String[] getOpciones() {
		return this.opciones;
	}
	
	public String getInfoText() {
		return this.infoText;
	}
	
	public void setStrategy(ConversorStrategy strategy) {
		this.strategy = strategy;
	}
	
	public double parseInput(String amount) {
		double value = Double.parseDouble(amount);
		return value;
	}
	
	public double realizarConversion(double amount) throws IOException {
		double newAmount = this.strategy.convertir(amount);
		return newAmount;
	}
	
	public void closeConversion() {
		this.strategy.close();
	}
	
	public String getUnits() {
		return this.strategy.getUnits();
	}


}
