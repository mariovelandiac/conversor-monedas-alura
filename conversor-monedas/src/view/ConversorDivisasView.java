package view;

public class ConversorDivisasView extends View {

	@Override
	public void mostrarResultado(String resultado, String unidades) {
		String respuesta = "Usted tiene " + resultado;
		super.mostrarResultado(respuesta, unidades);
	}



	
}
