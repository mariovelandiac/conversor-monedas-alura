package converter.models;

import converter.constants.OptionList;
import converter.strategies.ConverterStrategy;
import converter.utils.OpcionesTexto;

public abstract class Model  {

	protected ConverterStrategy strategy;
	protected String[] opciones;
	protected String infoText;
	
	public Model(OptionList[] opciones) {
		this.opciones = OpcionesTexto.getOpciones(opciones);
	}
	
	public void setStrategy(ConverterStrategy strategy) {
		this.strategy = strategy;
	}

	public double parseInput(String amount) {
		double value = Double.parseDouble(amount);
		return value;
	}

	public String realizarConversion(double amount) throws Exception {
		String newAmount = this.strategy.convertir(amount);
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
