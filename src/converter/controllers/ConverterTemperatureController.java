package converter.controllers;

import converter.constants.OpcionesTemperatura;
import converter.models.Model;
import converter.strategies.temp.*;
import converter.view.View;

public class ConverterTemperatureController extends ConverterController {
	
	public ConverterTemperatureController(Model model, View view) {
		super(model, view);
	}

	@Override
	public void inicializarConversiones() {
		this.conversiones.put(OpcionesTemperatura.CelToFarh.getText(), new CelToFarhStrategy());
		this.conversiones.put(OpcionesTemperatura.FarhToCel.getText(), new FarhToCelStrategy());
		this.conversiones.put(OpcionesTemperatura.CelToKel.getText(), new CelToKelStrategy());
		this.conversiones.put(OpcionesTemperatura.KelToCel.getText(), new KelToCelStrategy());
		this.conversiones.put(OpcionesTemperatura.FarhToRan.getText(), new FarhToRanStrategy());
		this.conversiones.put(OpcionesTemperatura.RanToFarh.getText(), new RanToFarhStrategy());
	}
}
