package converter.models;

import java.io.IOException;

import converter.constants.InfoText;
import converter.constants.OpcionesConversor;
import converter.constants.OptionList;
import converter.strategies.ConversorStrategy;

public class MenuInicialModel extends Model {
	
	private static final OptionList[] opciones = OpcionesConversor.values();
	
	public MenuInicialModel() {
		super(opciones);
		this.infoText = InfoText.MenuInicial.getStringToShow();
	}

	
}
