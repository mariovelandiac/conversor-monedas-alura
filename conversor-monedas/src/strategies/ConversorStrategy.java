package strategies;

public abstract class ConversorStrategy {
		
	private double conversionFactor;
	
	public void setConversonFactor(double conversionFactor) {
		this.conversionFactor = conversionFactor;
	}
	
	public double getConversonFactor() {
		return this.conversionFactor;
	}
	
	
}
