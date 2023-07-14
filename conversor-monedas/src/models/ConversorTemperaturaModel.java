package models;

import constants.InfoText;
import constants.OpcionesTemperatura;
import constants.OptionList;

public class ConversorTemperaturaModel extends Model {
	
	private static final OptionList[] opciones = OpcionesTemperatura.values();

	public ConversorTemperaturaModel() {
		super(opciones);
		this.infoText = InfoText.ConvTemperatura.getStringToShow();
	}
}
