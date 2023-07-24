package converter.models;

import converter.constants.InfoText;
import converter.constants.OpcionesConversor;
import converter.constants.OptionList;

public class MenuInicialModel extends Model {
	
	private static final OptionList[] opciones = OpcionesConversor.values();
	
	public MenuInicialModel() {
		super(opciones);
		this.infoText = InfoText.MenuInicial.getStringToShow();
	}

	
}
