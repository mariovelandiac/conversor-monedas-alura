package controllers;

import models.MenuInicialModel;
import view.MenuInicialView;

public class MenuInicialController {
	
	private MenuInicialView view;
	private MenuInicialModel model;
	
	public MenuInicialController(MenuInicialView view, MenuInicialModel model) {
		this.view = view;
		this.model = model;
	}
	
	public void launch() {
		String[] opciones = this.model.getOpciones();
		Object selected = this.view.mostrarOpciones(opciones);
		System.out.println(selected.toString());
	}
}
