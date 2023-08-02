package converter.strategies.currency;

import converter.constants.Divisas;

public class DolaresAYenJaponesStrategy extends DivisasStrategy {

	public DolaresAYenJaponesStrategy() {
		this.units = Divisas.JPY.getStringToShow();
		this.have = Divisas.USD.getIsoValue();
		this.want = Divisas.JPY.getIsoValue();
	}

}
