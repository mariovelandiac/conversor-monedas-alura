package converter.controllers;

import converter.models.Model;
import converter.utils.RestartConversion;
import converter.view.View;

public abstract class Controller {

	protected Model model;
	protected View view;

	public Controller(Model model, View view) {
		this.model = model;
		this.view = view;
	}

	public void launch() throws RestartConversion {
		try {
			String[] opciones = this.model.getOpciones();
			String infoText = this.model.getInfoText();
			String selected = this.view.mostrarOpciones(opciones, infoText);
			start(selected);
		} catch (IllegalArgumentException e) {
			this.view.mostrarMensajeInformacion(e.getMessage());
		}
	}

	public abstract void start(String selected) throws RestartConversion;

}
