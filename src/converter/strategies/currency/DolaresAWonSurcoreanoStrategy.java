package converter.strategies.currency;

import converter.constants.Divisas;

public class DolaresAWonSurcoreanoStrategy extends DivisasStrategy {

	public DolaresAWonSurcoreanoStrategy() {
		this.units = Divisas.KRW.getStringToShow();
		this.have = Divisas.USD.getIsoValue();
		this.want = Divisas.KRW.getIsoValue();
	}

}
