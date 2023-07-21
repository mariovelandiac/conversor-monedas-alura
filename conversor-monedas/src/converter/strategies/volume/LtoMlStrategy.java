package converter.strategies.volume;

import converter.constants.ConversionFactors;
import converter.constants.UnidadesVolumen;
import converter.strategies.ConversionStrategy;

public class LtoMlStrategy extends ConversionStrategy {
	
	public LtoMlStrategy() {
		this.conversionFactor = ConversionFactors.LtoMl.getConversionFactor();
		this.units = UnidadesVolumen.ml.getStringToShow();
	}
	
}
