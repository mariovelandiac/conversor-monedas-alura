package factory;

import controllers.ConversorController;
import controllers.ConversorDivisasController;
import models.ConversorDivisasModel;
import view.ConversorDivisasView;
import view.ConversorView;

public class OpcionConversorFactory {

	public static ConversorController createController(String opcionSelected) {
		switch (opcionSelected) {
		case "Conversor de Divisas": {
			ConversorDivisasView view = new ConversorDivisasView();
			ConversorDivisasModel model = new ConversorDivisasModel();
			ConversorController controller = new ConversorDivisasController(model, view);
			return controller;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + opcionSelected);
		}
	}
}
