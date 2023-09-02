package converter.strategies.currency;

import converter.constants.Divisas;

public class EurosAYenJaponesStrategy extends DivisasStrategy {

	public EurosAYenJaponesStrategy() {
		this.units = Divisas.JPY.getStringToShow();
		this.have = Divisas.EUR.getIsoValue();
		this.want = Divisas.JPY.getIsoValue();
	}

}
