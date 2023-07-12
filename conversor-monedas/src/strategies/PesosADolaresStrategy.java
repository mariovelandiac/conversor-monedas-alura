package strategies;

import constants.Divisas;

public class PesosADolaresStrategy implements ConversorStrategy {

	private double conversionFactor;
	private String units = Divisas.USD.getStringToShow();
	private String want = Divisas.USD.getIsoValue();
	

	@Override
	public double convertir(double amount) {
		this.setConversionFactor();
		double newAmount = amount*this.getConversionFactor();
		return newAmount;
	}

	@Override
	public void setConversionFactor() {
		this.conversionFactor = 2;
	}
	
	private double getConversionFactor() {
		return this.conversionFactor;
	}

	@Override
	public String getUnits() {
		return this.units;
	}


}
