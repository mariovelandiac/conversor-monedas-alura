package converter.strategies.currency;

import converter.constants.Divisas;

public class EurosAWonSurcoreanoStrategy extends DivisasStrategy {

	public EurosAWonSurcoreanoStrategy() {
		this.units = Divisas.KRW.getStringToShow();
		this.have = Divisas.EUR.getIsoValue();
		this.want = Divisas.KRW.getIsoValue();
	}

}
