package controllers;

import models.ConversorDivisasModel;
import view.ConversorDivisasView;

public class ConversorDivisasController implements ConversorController {

	private ConversorDivisasModel model;
	private ConversorDivisasView view;
	
	public ConversorDivisasController(ConversorDivisasModel model, ConversorDivisasView view) {
		this.model = model;
		this.view = view;
	}
	
	@Override
	public void realizarConversion() {
		// TODO Auto-generated method stub
		
	}

}
