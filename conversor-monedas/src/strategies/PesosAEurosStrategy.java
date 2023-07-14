package strategies;

import constants.Divisas;

public class PesosAEurosStrategy extends DivisasStrategy {
	
	public PesosAEurosStrategy() {
		this.units = Divisas.EUR.getStringToShow();
		this.have = Divisas.COP.getIsoValue();
		this.want = Divisas.EUR.getIsoValue();
	}
}
