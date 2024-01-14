package converter.strategies.currency;

import converter.constants.Divisas;

public class EurosALibrasExterlinasStrategy extends DivisasStrategy {

	public EurosALibrasExterlinasStrategy() {
		this.units = Divisas.GBP.getStringToShow();
		this.have = Divisas.EUR.getIsoValue();
		this.want = Divisas.GBP.getIsoValue();
	}

}
