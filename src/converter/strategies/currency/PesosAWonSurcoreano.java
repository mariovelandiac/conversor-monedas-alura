package converter.strategies.currency;

import converter.constants.Divisas;

public class PesosAWonSurcoreano extends DivisasStrategy {

	public PesosAWonSurcoreano() {
		this.units = Divisas.KRW.getStringToShow();
		this.have = Divisas.COP.getIsoValue();
		this.want = Divisas.KRW.getIsoValue();
	}

}
