package converter.strategies.temp;

import converter.constants.UnidadesTemperatura;
import converter.strategies.ConversionStrategy;

public class FarhToCelStrategy extends ConversionStrategy {

	public FarhToCelStrategy() {
		this.units = UnidadesTemperatura.Cel.getText();
	}
	
	@Override
	public void setNewAmount(double amount) throws Exception {
		this.newAmount = (amount - 32) * 5 / 9;
	}
}
