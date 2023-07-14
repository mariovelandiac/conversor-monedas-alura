package strategies;

import constants.Divisas;


public class PesosADolaresStrategy extends DivisasStrategy {

	public PesosADolaresStrategy() {
		this.units = Divisas.USD.getStringToShow();
		this.have = Divisas.COP.getIsoValue();
		this.want = Divisas.USD.getIsoValue();
	}
	
}
