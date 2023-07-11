package models;

import constants.InfoText;
import constants.OpcionesConversor;
import constants.OptionList;
import utils.OpcionesTexto;

public class MenuInicialModel {

	private String[] opciones;
	private String infoText;
	
	public MenuInicialModel() {
		this.infoText = InfoText.MenuInicial.getStringToShow();
		OptionList[] opcionesConversor = OpcionesConversor.values();
		this.opciones = OpcionesTexto.getOpciones(opcionesConversor);
	}
	
	public String[] getOpciones() {
		return this.opciones;
	}
	
	public String getInfoText() {
		return this.infoText;
	}
}
