package InterfacesGraficas;

import constants.ShowArrayStringText;

public class OpcionesTexto {

	public static Object[] getOpciones(ShowArrayStringText[] opciones) {
		ShowArrayStringText[] opcionesTextos = new ShowArrayStringText[opciones.length];
		int i = 0;
		for (ShowArrayStringText opcion : opciones) {
			opcionesTextos[i] = opcion;
			i++;
		}
		return opcionesTextos;
	}

}
