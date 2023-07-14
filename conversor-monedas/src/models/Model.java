package models;

import constants.OptionList;
import strategies.ConversorStrategy;
import utils.OpcionesTexto;

public abstract class Model  {

	protected ConversorStrategy strategy;
	protected String[] opciones;
	protected String infoText;
	
	public Model(OptionList[] opciones) {
		this.opciones = OpcionesTexto.getOpciones(opciones);
	}
	
	public void setStrategy(ConversorStrategy strategy) {
		this.strategy = strategy;
	}

	public double parseInput(String amount) {
		double value = Double.parseDouble(amount);
		return value;
	}

	public double realizarConversion(double amount) throws Exception {
		double newAmount = this.strategy.convertir(amount);
		return newAmount;
	}
	

	public void closeConversion() {
		this.strategy.close();
	}

	public String getUnits() {
		return this.strategy.getUnits();
	}
	
	public String[] getOpciones() {
		return this.opciones;
	}
	
	public String getInfoText() {
		return this.infoText;
	}

}
