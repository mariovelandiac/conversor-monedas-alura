package converter.strategies.currency;

import converter.constants.Divisas;

public class DolaresAPesosStrategy extends DivisasStrategy {

	public DolaresAPesosStrategy() {
		this.units = Divisas.COP.getStringToShow();
		this.have = Divisas.USD.getIsoValue();
		this.want = Divisas.COP.getIsoValue();
	}

}
