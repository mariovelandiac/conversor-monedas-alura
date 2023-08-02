package converter.strategies.temp;

import converter.constants.ConversionFactors;
import converter.constants.UnidadesTemperatura;
import converter.strategies.ConversionStrategy;

public class FarhToRanStrategy extends ConversionStrategy {

	public FarhToRanStrategy() {
		this.units = UnidadesTemperatura.Ran.getText();
	}

	@Override
	public void setNewAmount(double amount) throws Exception {
		this.newAmount = amount - ConversionFactors.FarhToRan.getConversionFactor();
	}
}
