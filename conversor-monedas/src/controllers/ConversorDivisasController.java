package controllers;

import java.util.HashMap;
import java.util.Map;

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
		// this.view hacer online off line
		// this.view segun opcion mostrar cuadro de ingresar valor o valores
		// this.model hacer conversion y darle la caantidad a convertir(con dos metodos uno con un argumento por si es online y otro con dos argumentos por si no)
		// this.view retornar valor
	}
	
	@Override
	public void realizarConversion() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void inicializarConversiones() {
		this.conversiones.put(OpcionesDivisas.COPtoUSD.getStringToShow(), new PesosADolaresStrategy());
		
	}
	
	public void seleccionarEstrategia(String selectedOption) {
		ConversorStrategy strategy = this.conversiones.get(selectedOption);
		if (strategy != null) {
			System.out.println("Estrategia inicializada");
			this.model.setStrategy(strategy);			
		} else {
			System.out.println("Opcion no valida, aqui debería ir un throw con el view.mostrarMensajeError()");
		}
	}
	


}
