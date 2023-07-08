package utils;

import constants.ShowArrayStringText;

public class OpcionesTexto {

	public static String[] getOpciones(ShowArrayStringText[] opciones) {
		String[] opcionesTexto = new String[opciones.length];
		for (int i = 0; i < opciones.length; i++) {
			opcionesTexto[i] = opciones[i].getStringToShow();
		}
		return opcionesTexto;
	}

}
