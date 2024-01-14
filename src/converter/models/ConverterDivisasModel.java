package converter.models;

import converter.constants.InfoText;
import converter.constants.OpcionesDivisas;
import converter.constants.OptionList;

public class ConverterDivisasModel extends Model {
	
	private static final OptionList[] opciones = OpcionesDivisas.values();

	public ConverterDivisasModel() {
		super(opciones);
		this.infoText = InfoText.ConvDivisas.getText();
	}


}
