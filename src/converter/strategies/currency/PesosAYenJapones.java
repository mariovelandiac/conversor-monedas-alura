package converter.strategies.currency;

import converter.constants.Divisas;

public class PesosAYenJapones extends DivisasStrategy {

	public PesosAYenJapones() {
		this.units = Divisas.JPY.getStringToShow();
		this.have = Divisas.COP.getIsoValue();
		this.want = Divisas.JPY.getIsoValue();
	}

}
