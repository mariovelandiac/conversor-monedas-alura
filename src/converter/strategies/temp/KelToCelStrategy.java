package converter.strategies.temp;

import converter.constants.ConversionFactors;
import converter.constants.UnidadesTemperatura;
import converter.strategies.ConversionStrategy;

public class KelToCelStrategy extends ConversionStrategy {

	public KelToCelStrategy() {
		this.units = UnidadesTemperatura.Cel.getText();
	}

	@Override
	public void setNewAmount(double amount) throws Exception {
		this.newAmount = amount - ConversionFactors.CelToKel.getConversionFactor();
	}
}
