package converter.strategies.volume;

import converter.constants.ConversionFactors;
import converter.constants.UnidadesVolumen;
import converter.strategies.ConversionStrategy;

public class MlToLStrategy extends ConversionStrategy {
	
	public MlToLStrategy() {
		this.conversionFactor = ConversionFactors.mlToL.getConversionFactor();
		this.units = UnidadesVolumen.l.getText();
	}
	
}
