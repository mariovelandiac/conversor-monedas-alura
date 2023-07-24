package converter.strategies.currency;

import converter.constants.Divisas;

public class PesosALibrasExterlinas extends DivisasStrategy {

	public PesosALibrasExterlinas() {
		this.units = Divisas.GBP.getStringToShow();
		this.have = Divisas.COP.getIsoValue();
		this.want = Divisas.GBP.getIsoValue();
	}

}
