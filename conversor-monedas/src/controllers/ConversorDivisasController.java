package controllers;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import constants.InfoText;
import constants.OpcionesDivisas;
import models.ConversorDivisasModel;
import view.ConversorDivisasView;
import strategies.*;
import utils.RestartConversion;

public class ConversorDivisasController extends ConversorController {

	private ConversorDivisasModel model;
	private ConversorDivisasView view;
	private Map<String, ConversorStrategy> conversiones;

	public ConversorDivisasController(ConversorDivisasModel model, ConversorDivisasView view) {
		this.model = model;
		this.view = view;
		this.conversiones = new HashMap<>();
		this.inicializarConversiones();
	}

	@Override
	public void launch() throws RestartConversion {
		try {
			String[] opciones = this.model.getOpciones();
			String infoText = this.model.getInfoText();
			String selected = this.view.mostrarOpciones(opciones, infoText);
			this.seleccionarEstrategia(selected);
			this.startConversion();
		} catch (IllegalArgumentException e) {
			this.view.mostrarMensajeInformacion(e.getMessage());
		}
	}

	private void startConversion() throws RestartConversion {
		boolean validInput = false;
		while (!validInput) {
			String amount = this.view.leerEntrada();
			Double amountParsed = this.validateInput(amount);
			if (amountParsed != null) {
				validInput = true;
				this.realizarConversion(amountParsed);
				this.endConversion();
			}
		}
	}

	@Override
	public void realizarConversion(double amount) {
		try {
			double newAmount = this.model.realizarConversion(amount);
			this.view.mostrarResultado(String.valueOf(newAmount), this.model.getUnits());			
		} catch (IOException e) {
			this.view.mostrarMensajeError(e.getMessage());
		} finally {
			this.model.closeConversion();
		}
	}
	
	public void endConversion() throws RestartConversion {
		int response = this.view.mostrarConfirmacionSalida();
		if (response != 0) {
			this.view.mostrarMensajeInformacion(InfoText.CerrarConversion.getStringToShow());
		} else {
			throw new RestartConversion();
		}
	}

	@Override
	protected void inicializarConversiones() {
		this.conversiones.put(OpcionesDivisas.COPtoUSD.getStringToShow(), new PesosADolaresStrategy());
	}

	public void seleccionarEstrategia(String selectedOption) {
		ConversorStrategy strategy = this.conversiones.get(selectedOption);
		if (strategy != null) {
			this.model.setStrategy(strategy);
		} else {
			throw new IllegalArgumentException(InfoText.ErrorInvalidOption.getStringToShow());
		}
	}

	private Double validateInput(String amount) {
		try {
			return this.model.parseInput(amount);
		} catch (NumberFormatException e) {
			this.view.mostrarMensajeError(InfoText.ErrorDoubleInput.getStringToShow());
			return null;
		}
	}

}
