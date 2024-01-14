package converter.strategies.temp;

import converter.constants.ConversionFactors;
import converter.constants.UnidadesTemperatura;
import converter.strategies.ConversionStrategy;

public class RanToFarhStrategy extends ConversionStrategy {

	public RanToFarhStrategy() {
		this.units = UnidadesTemperatura.Farh.getText();
	}

	@Override
	public void setNewAmount(double amount) throws Exception {
		this.newAmount = amount - ConversionFactors.FarhToRan.getConversionFactor();
	}
}
