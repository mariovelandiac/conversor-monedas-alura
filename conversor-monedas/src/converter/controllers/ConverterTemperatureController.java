package converter.controllers;

import converter.constants.OpcionesTemperatura;
import converter.models.Model;
import converter.strategies.temp.CelToFarhStrategy;
import converter.strategies.temp.FarhToCelStrategy;
import converter.view.View;

public class ConverterTemperatureController extends ConverterController {
	
	public ConverterTemperatureController(Model model, View view) {
		super(model, view);
	}

	@Override
	public void inicializarConversiones() {
		this.conversiones.put(OpcionesTemperatura.CelToFarh.getStringToShow(), new CelToFarhStrategy());
		this.conversiones.put(OpcionesTemperatura.FarhToCel.getStringToShow(), new FarhToCelStrategy());
	}
}
