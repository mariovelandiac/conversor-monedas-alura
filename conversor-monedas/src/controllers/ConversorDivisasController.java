package controllers;

import constants.OpcionesDivisas;
import models.Model;
import view.View;
import strategies.*;
import utils.RestartConversion;

public class ConversorDivisasController extends ConversorController {

	public ConversorDivisasController(Model model, View view) {
		super(model, view);
	}
	
	@Override
	public void inicializarConversiones() {
		this.conversiones.put(OpcionesDivisas.COPtoUSD.getStringToShow(), new PesosADolaresStrategy());
		this.conversiones.put(OpcionesDivisas.COPtoEUR.getStringToShow(), new PesosAEurosStrategy());
	}





}
