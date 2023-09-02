package converter.strategies.currency;

import converter.constants.Divisas;

public class EurosADolaresStrategy extends DivisasStrategy {

	public EurosADolaresStrategy() {
		this.units = Divisas.USD.getStringToShow();
		this.have = Divisas.EUR.getIsoValue();
		this.want = Divisas.USD.getIsoValue();
	}

}
