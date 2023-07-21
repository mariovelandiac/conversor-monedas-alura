package converter.models;

import converter.constants.InfoText;
import converter.constants.OpcionesVolumen;
import converter.constants.OptionList;

public class ConverterVolumeModel extends Model {
	
	private static final OptionList[] opciones = OpcionesVolumen.values();

	public ConverterVolumeModel() {
		super(opciones);
		this.infoText = InfoText.ConvVolumen.getStringToShow();
	}
}
