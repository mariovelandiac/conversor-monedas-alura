package controllers;

import java.util.HashMap;
import java.util.Map;

import constants.InfoText;
import constants.OpcionesDivisas;
import models.ConversorDivisasModel;
import view.ConversorDivisasView;
import strategies.*;

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
	public void launch() {
		String[] opciones = this.model.getOpciones();
		String infoText = this.model.getInfoText();
		String selected = this.view.mostrarOpciones(opciones, infoText);
		this.seleccionarEstrategia(selected);
		this.startConversion();
	}

	private void startConversion() {
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

	public void endConversion() {
		// Implementar tasa de conversion en setConversionFactor
		// implmentar metodo end conversion
	}
	@Override
	public void realizarConversion(double amount) {
		try {
			double newAmount = this.model.realizarConversion(amount);
			this.view.mostrarResultado(String.valueOf(newAmount), this.model.getWant());
		} catch (Exception e) {
			this.view.mostrarMensajeError(e.getMessage());
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
			this.view.mostrarMensajeError("Opcion de Conversión Invalida");
		}
	}

	private Double validateInput(String amount) {
		try {
			return this.model.validateInput(amount);
		} catch (NumberFormatException e) {
			this.view.mostrarMensajeError(InfoText.ErrorInput.getStringToShow());
			return null;
		}
	}

}
