package models;

import constants.InfoText;
import constants.OpcionesDivisas;
import constants.OptionList;

public class ConversorDivisasModel extends Model {
	
	private static final OptionList[] opciones = OpcionesDivisas.values();

	public ConversorDivisasModel() {
		super(opciones);
		this.infoText = InfoText.ConvDivisas.getStringToShow();
	}


}
