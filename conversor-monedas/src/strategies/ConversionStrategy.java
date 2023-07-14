package strategies;

import utils.ConversoraDivisasOnline;

public abstract class ConversionStrategy implements ConversorStrategy {

	protected String units;
	protected String have;
	protected String want;
	protected double newAmount;
	protected double conversionFactor;
	protected ConversoraDivisasOnline conversion;

	@Override
	public double convertir(double amount) throws Exception {
		this.setNewAmount(amount);
		double newAmount = this.getNewAmount();
		return newAmount;
	}

	@Override
	public void setNewAmount(double amount) throws Exception {
		this.newAmount = amount * this.conversionFactor;
	}

	@Override
	public String getUnits() {
		return this.units;
	}

	@Override
	public void close() {
		return;
	}

	@Override
	public double getNewAmount() {
		return this.newAmount;
	}

}
