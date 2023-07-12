package view;

public class ConversorDivisasView extends MenuView {

	private String want;
	
	private String getWant() {
		return want;
	}

	public void setWant(String want) {
		this.want = want;
	}

	@Override
	public String mostrarOpciones(String[] opciones, String textToShow) {
		return super.mostrarOpciones(opciones, textToShow);
	}
	
	@Override
	public String leerEntrada() {
		return super.leerEntrada();
	}

	@Override
	public void mostrarResultado(String resultado, String unidades) {
		String respuesta = "Usted tiene " + resultado;
		super.mostrarResultado(respuesta, unidades);
	}

	@Override
	public void mostrarMensajeError(String message) {
		super.mostrarMensajeError(message);
	};


	
}
