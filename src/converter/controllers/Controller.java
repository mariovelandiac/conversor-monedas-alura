package converter.controllers;

import converter.constants.InfoText;
import converter.models.Model;
import converter.utils.RestartConversion;
import converter.view.View;
/**
 * 
 * @author mariovelandiac
 * @version 1.0.0
 *
 */
public abstract class Controller {

	protected Model model;
	protected View view;
/**
 * Constructor para inicializar una clase concreta que herede de Controller y que recibe como 
 * parametros un objeto model y un objeto view
 * @param model
 * @param view
 */
	public Controller(Model model, View view) {
		this.model = model;
		this.view = view;
	}
/**
 * El método launch contiene la lógica de ejecución de los controladores
 * @throws RestartConversion
 */
	public void launch() throws RestartConversion {
		try {
			String[] opciones = this.model.getOpciones();
			String infoText = this.model.getInfoText();
			String selected = this.view.mostrarOpciones(opciones, infoText);
			start(selected);
		} catch (IllegalArgumentException e) {
			this.view.mostrarMensajeInformacion(e.getMessage());
			this.view.mostrarMensajeInformacion(InfoText.CerrarConversion.getText());
		}
	}

	public abstract void start(String selected) throws RestartConversion;

}
