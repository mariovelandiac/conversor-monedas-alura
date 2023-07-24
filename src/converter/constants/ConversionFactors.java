package converter.constants;

public enum ConversionFactors {
	mlToL(0.001),
	LtoMl(1000);
	
	private double conversionFactor;
	
	ConversionFactors(double conversionFactor) {
		this.conversionFactor = conversionFactor;
	}
	
	public double getConversionFactor() {
		return this.conversionFactor;
	}
}
