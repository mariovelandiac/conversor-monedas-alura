package converter.view;

import converter.constants.OpcionesConversor;

public class ConverterDivisasView extends View {
	
	private static final String TITLE = OpcionesConversor.Divisas.getText();
	
	public ConverterDivisasView() {
		super(TITLE);
	}

	@Override
	public void mostrarResultado(String resultado, String unidades) {
		String respuesta = "Usted tiene " + resultado;
		super.mostrarResultado(respuesta, unidades);
	}



	
}
