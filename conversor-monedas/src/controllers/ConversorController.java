package controllers;
import java.util.HashMap;
import java.util.Map;
import constants.InfoText;
import models.Model;
import strategies.ConversorStrategy;
import utils.RestartConversion;
import view.View;

public abstract class ConversorController extends Controller {
	
	
	protected Map<String, ConversorStrategy> conversiones;
	
	public ConversorController(Model model, View view) {
		super(model, view);
		this.conversiones = new HashMap<>();
		inicializarConversiones();
	}
	
	protected void startConversion() throws RestartConversion {
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
	
	protected void realizarConversion(double amount) {
		try {
			double newAmount = this.model.realizarConversion(amount);
			this.view.mostrarResultado(String.valueOf(newAmount), this.model.getUnits());
		} catch (Exception e) {
			this.view.mostrarMensajeError(e.getMessage());
		} finally {
			this.model.closeConversion();
		}
	}
	
	protected void endConversion() throws RestartConversion {
		int response = this.view.mostrarConfirmacionSalida();
		if (response != 0) {
			this.view.mostrarMensajeInformacion(InfoText.CerrarConversion.getStringToShow());
		} else {
			throw new RestartConversion();
		}
	}
	
	protected void seleccionarEstrategia(String selectedOption) {
		ConversorStrategy strategy = this.conversiones.get(selectedOption);
		if (strategy != null) {
			this.model.setStrategy(strategy);
		} else {
			throw new IllegalArgumentException(InfoText.ErrorInvalidOption.getStringToShow());
		}
	}
	
	protected Double validateInput(String amount) {
		try {
			return this.model.parseInput(amount);
		} catch (NumberFormatException e) {
			this.view.mostrarMensajeError(InfoText.ErrorDoubleInput.getStringToShow());
			return null;
		}
	}
	
	@Override
	public void start(String selected) throws RestartConversion {
		this.seleccionarEstrategia(selected);
		this.startConversion();
	}
	
	public abstract void inicializarConversiones();
}
