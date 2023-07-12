package models;

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
	
	public double validateInput(String amount) {
		double value = Double.parseDouble(amount);
		return value;
	}
	
	public double realizarConversion(double amount) {
		double newAmount = this.strategy.convertir(amount);
		return newAmount;
	}
	
	public String getWant() {
		return this.strategy.getUnits();
	}

}
