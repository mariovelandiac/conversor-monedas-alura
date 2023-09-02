package converter.utils;

import converter.constants.OptionList;

public class OpcionesTexto {

	public static String[] getOpciones(OptionList[] opciones) {
		String[] opcionesTexto = new String[opciones.length];
		for (int i = 0; i < opciones.length; i++) {
			opcionesTexto[i] = opciones[i].getText();
		}
		return opcionesTexto;
	}

}
