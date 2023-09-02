package converter.controllers;

import java.util.HashMap;
import java.util.Map;

import converter.constants.InfoText;
import converter.models.Model;
import converter.strategies.ConverterStrategy;
import converter.utils.RestartConversion;
import converter.view.View;

public abstract class ConverterController extends Controller {

	protected Map<String, ConverterStrategy> conversiones;

	public ConverterController(Model model, View view) {
		super(model, view);
		this.conversiones = new HashMap<>();
		this.inicializarConversiones();
	}

	@Override
	public void start(String selected) throws RestartConversion {
		this.seleccionarEstrategia(selected);
		this.startConversion();
	}

	public abstract void inicializarConversiones();

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
			String newAmount = this.model.realizarConversion(amount);
			this.view.mostrarResultado(newAmount, this.model.getUnits());
		} catch (Exception e) {
			this.view.mostrarMensajeError(e.getMessage());
		} finally {
			this.model.closeConversion();
		}
	}

	protected void endConversion() throws RestartConversion {
		int response = this.view.mostrarConfirmacionSalida();
		if (response != 0) {
			this.view.mostrarMensajeInformacion(InfoText.CerrarConversion.getText());
		} else {
			throw new RestartConversion();
		}
	}

	protected void seleccionarEstrategia(String selectedOption) {
		ConverterStrategy strategy = this.conversiones.get(selectedOption);
		if (strategy != null) {
			this.model.setStrategy(strategy);
		} else {
			throw new IllegalArgumentException(InfoText.ErrorInvalidOption.getText());
		}
	}

	protected Double validateInput(String amount) {
		try {
			return this.model.parseInput(amount);
		} catch (NumberFormatException e) {
			this.view.mostrarMensajeError(InfoText.ErrorDoubleInput.getText());
			return null;
		}
	}

}
