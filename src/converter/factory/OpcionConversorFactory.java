package converter.factory;

import converter.controllers.*;
import converter.models.*;
import converter.view.*;

public class OpcionConversorFactory {

	public static Controller createController(String opcionSelected) {
		switch (opcionSelected) {
		case "Conversor de Divisas": {
			ConverterDivisasView view = new ConverterDivisasView();
			ConverterDivisasModel model = new ConverterDivisasModel();
			Controller controller = new ConverterDivisasController(model, view);
			return controller;
		}
		case "Conversor de Unidades de Temperatura": {
			ConverterTemperatureView view = new ConverterTemperatureView();
			ConverterTemperatureModel model = new ConverterTemperatureModel();
			ConverterTemperatureController controller = new ConverterTemperatureController(model,  view);
			return controller;
		}
		case "Conversor de Unidades de Volumen": {
			ConverterVolumeModel model = new ConverterVolumeModel();
			ConverterVolumeView view = new ConverterVolumeView();
			ConverterVolumeController controller = new ConverterVolumeController(model, view);
			return controller;
			
		}
		default:
			throw new IllegalArgumentException("No se ha encontrado el conversor: " + opcionSelected);
		}
	}
}
