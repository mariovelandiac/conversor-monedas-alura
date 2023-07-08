package models;

import constants.OpcionesConversor;
import utils.OpcionesTexto;

public class MenuInicialModel {

	private OpcionesConversor[] opciones;
	
	public MenuInicialModel() {
		this.opciones = OpcionesConversor.values();
	}

	public String[] getOpciones() {
		String[] textoOpciones = OpcionesTexto.getOpciones(this.opciones);
		return textoOpciones;
	}
}
