package factory;

import controllers.*;
import models.*;
import view.*;

public class OpcionConversorFactory {

	public static Controller createController(String opcionSelected) {
		switch (opcionSelected) {
		case "Conversor de Divisas": {
			ConversorDivisasView view = new ConversorDivisasView();
			ConversorDivisasModel model = new ConversorDivisasModel();
			Controller controller = new ConversorDivisasController(model, view);
			return controller;
		}
		case "Conversor de Unidades de Temperatura": {
			ConversorTemperaturaView view = new ConversorTemperaturaView();
			ConversorTemperaturaModel model = new ConversorTemperaturaModel();
			ConversorTemperaturaController controller = new ConversorTemperaturaController(model,  view);
			return controller;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + opcionSelected);
		}
	}
}
