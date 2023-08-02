package converter.strategies.temp;

import converter.constants.UnidadesTemperatura;
import converter.strategies.ConversionStrategy;

public class CelToFarhStrategy extends ConversionStrategy {

	public CelToFarhStrategy() {
		this.units = UnidadesTemperatura.Farh.getText();
	}

	@Override
	public void setNewAmount(double amount) throws Exception {
		this.newAmount = (amount * 9 / 5) + 32;
	}
}
