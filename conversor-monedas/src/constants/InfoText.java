package constants;

public enum InfoText {
	MenuInicial("Escoja el tipo de conversor a utilizar"),
	ConvDivisas("Escoja las monedas entre las que desea realizar la conversión"),
	InputAmount("Ingrese el valor a convertir separado por un punto en caso de ser necesario"),
	ErrorInput("Debe ingresar un valor númerico");
	
	private String stringToShow;

	InfoText(String stringToShow) {
		this.stringToShow = stringToShow;
	}

	public String getStringToShow() {
		return this.stringToShow;
	}
}
