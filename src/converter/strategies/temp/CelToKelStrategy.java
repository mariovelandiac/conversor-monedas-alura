package converter.strategies.temp;

import converter.constants.ConversionFactors;
import converter.constants.UnidadesTemperatura;
import converter.strategies.ConversionStrategy;

public class CelToKelStrategy extends ConversionStrategy {

	public CelToKelStrategy() {
		this.units = UnidadesTemperatura.Kel.getText();
	}

	@Override
	public void setNewAmount(double amount) throws Exception {
		this.newAmount = amount + ConversionFactors.CelToKel.getConversionFactor();
	}
}
