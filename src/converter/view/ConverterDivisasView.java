package converter.view;

import converter.constants.OpcionesConversor;

public class ConverterDivisasView extends View {
	
	private static final String title = OpcionesConversor.Divisas.getStringToShow();
	
	public ConverterDivisasView() {
		super(title);
	}

	@Override
	public void mostrarResultado(String resultado, String unidades) {
		String respuesta = "Usted tiene " + resultado;
		super.mostrarResultado(respuesta, unidades);
	}



	
}
