package controllers;

import factory.OpcionConversorFactory;
import models.MenuInicialModel;
import utils.RestartConversion;
import view.MenuInicialView;

public class MenuInicialController {

	private MenuInicialView view;
	private MenuInicialModel model;

	public MenuInicialController(MenuInicialView view, MenuInicialModel model) {
		this.view = view;
		this.model = model;
	}

	public void launch() throws RestartConversion {
		try {			
			String[] opciones = this.model.getOpciones();
			String infoText = this.model.getInfoText();
			String selected = this.view.mostrarOpciones(opciones, infoText);
			ConversorController controller = OpcionConversorFactory.createController(selected);
			controller.launch();
		} catch (IllegalArgumentException e) {
			this.view.mostrarMensajeInformacion(e.getMessage());
		}
	}
}
