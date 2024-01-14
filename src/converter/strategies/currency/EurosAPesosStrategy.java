package converter.strategies.currency;

import converter.constants.Divisas;

public class EurosAPesosStrategy extends DivisasStrategy {

	public EurosAPesosStrategy() {
		this.units = Divisas.COP.getStringToShow();
		this.have = Divisas.EUR.getIsoValue();
		this.want = Divisas.COP.getIsoValue();
	}

}
