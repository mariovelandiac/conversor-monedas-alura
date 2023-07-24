package converter.models;

import converter.constants.InfoText;
import converter.constants.OpcionesTemperatura;
import converter.constants.OptionList;

public class ConverterTemperatureModel extends Model {
	
	private static final OptionList[] opciones = OpcionesTemperatura.values();

	public ConverterTemperatureModel() {
		super(opciones);
		this.infoText = InfoText.ConvTemperatura.getStringToShow();
	}
}
