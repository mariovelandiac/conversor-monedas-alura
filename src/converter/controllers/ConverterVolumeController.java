package converter.controllers;

import converter.constants.OpcionesVolumen;
import converter.models.Model;
import converter.strategies.volume.LtoMlStrategy;
import converter.strategies.volume.MlToLStrategy;
import converter.view.View;

public class ConverterVolumeController extends ConverterController {

	public ConverterVolumeController(Model model, View view) {
		super(model, view);
	}

	@Override
	public void inicializarConversiones() {
		this.conversiones.put(OpcionesVolumen.mlAl.getText(), new MlToLStrategy());
		this.conversiones.put(OpcionesVolumen.lAml.getText(), new LtoMlStrategy());
	}

}
