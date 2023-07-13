package strategies;

import java.io.IOException;

import constants.Divisas;
import utils.ConversoraDivisasOnline;

public class PesosADolaresStrategy implements ConversorStrategy {

	private double newAmount;
	private String units;
	private String have;
	private String want;
	ConversoraDivisasOnline conversion;
	
	public PesosADolaresStrategy() {
		this.units = Divisas.USD.getStringToShow();
		this.have = Divisas.COP.getIsoValue();
		this.want = Divisas.USD.getIsoValue();
	}
	
	@Override
	public double convertir(double amount) throws IOException {
		this.setNewAmount(amount);
		double newAmount = this.getNewAmount();
		return newAmount;
	}

	@Override
	public void setNewAmount(double amount) throws IOException {
		conversion = new ConversoraDivisasOnline();
		this.newAmount = conversion.convertCurrency(have, want, amount);
	}
	
	private double getNewAmount() {
		return this.newAmount;
	}

	@Override
	public String getUnits() {
		return this.units;
	}
	
	public void close() {
		conversion.close();
	}


}
