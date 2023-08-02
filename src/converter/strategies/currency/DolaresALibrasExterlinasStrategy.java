package converter.strategies.currency;

import converter.constants.Divisas;

public class DolaresALibrasExterlinasStrategy extends DivisasStrategy {

	public DolaresALibrasExterlinasStrategy() {
		this.units = Divisas.GBP.getStringToShow();
		this.have = Divisas.USD.getIsoValue();
		this.want = Divisas.GBP.getIsoValue();
	}

}
