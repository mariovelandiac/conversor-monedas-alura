package converter.strategies.currency;

import converter.constants.Divisas;

public class DolaresAEurosStrategy extends DivisasStrategy {

	public DolaresAEurosStrategy() {
		this.units = Divisas.EUR.getStringToShow();
		this.have = Divisas.USD.getIsoValue();
		this.want = Divisas.EUR.getIsoValue();
	}

}
