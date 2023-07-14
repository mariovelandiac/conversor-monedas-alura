package view;

import constants.OpcionesConversor;

public class ConversorDivisasView extends View {
	
	private static final String title = OpcionesConversor.Divisas.getStringToShow();
	
	public ConversorDivisasView() {
		super(title);
	}

	@Override
	public void mostrarResultado(String resultado, String unidades) {
		String respuesta = "Usted tiene " + resultado;
		super.mostrarResultado(respuesta, unidades);
	}



	
}
