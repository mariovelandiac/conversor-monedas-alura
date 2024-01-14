package converter.constants;
/**
 * 
 * @author mariovelandiac
 * @version 1.0.0
 * Este enum contiene los diversos factores de conversión constantes utilizados por el conversor de unidades
 *
 */
public enum ConversionFactors {
	mlToL(0.001),
	LtoMl(1000),
	CelToKel(273.15),
	FarhToRan(459.67);
	
	private double conversionFactor;
	
	ConversionFactors(double conversionFactor) {
		this.conversionFactor = conversionFactor;
	}
	
	public double getConversionFactor() {
		return this.conversionFactor;
	}
}
