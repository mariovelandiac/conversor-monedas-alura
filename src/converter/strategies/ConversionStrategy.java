package converter.strategies;

import java.text.DecimalFormat;

import converter.utils.ConversoraDivisasOnline;

public abstract class ConversionStrategy implements ConversorStrategy {

	protected String units;
	protected String have;
	protected String want;
	protected double newAmount;
	protected double conversionFactor;
	protected ConversoraDivisasOnline conversion;

	@Override
	public String convertir(double amount) throws Exception {
		this.setNewAmount(amount);
		double newAmount = this.getNewAmount();
		return this.formatResponse(newAmount);
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
	
	private String formatResponse(double amount) {
		DecimalFormat decimalFormat = new DecimalFormat("#.00");
		String formatedResponse = decimalFormat.format(amount);
		return formatedResponse;
	}

}
