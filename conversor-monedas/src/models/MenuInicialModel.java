package models;

import java.io.IOException;

import constants.InfoText;
import constants.OpcionesConversor;
import constants.OptionList;
import strategies.ConversorStrategy;

public class MenuInicialModel extends Model {
	
	private static final OptionList[] opciones = OpcionesConversor.values();
	
	public MenuInicialModel() {
		super(opciones);
		this.infoText = InfoText.MenuInicial.getStringToShow();
	}

	
}
