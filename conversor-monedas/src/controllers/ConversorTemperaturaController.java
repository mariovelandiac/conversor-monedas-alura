package controllers;

import constants.OpcionesDivisas;
import constants.OpcionesTemperatura;
import models.Model;
import strategies.CelToFarhStrategy;
import strategies.PesosADolaresStrategy;
import strategies.PesosAEurosStrategy;
import view.View;

public class ConversorTemperaturaController extends ConversorController {
	
	public ConversorTemperaturaController(Model model, View view) {
		super(model, view);
	}

	@Override
	public void inicializarConversiones() {
		this.conversiones.put(OpcionesTemperatura.CelToFarh.getStringToShow(), new CelToFarhStrategy());
	}
}
