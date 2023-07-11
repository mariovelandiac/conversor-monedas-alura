package constants;

public enum InfoText {
	MenuInicial("Escoja el tipo de conversor a utilizar"),
	ConvDivisas("Escoja las monedas entre las que desea realizar la conversión");

	private String stringToShow;

	InfoText(String stringToShow) {
		this.stringToShow = stringToShow;
	}

	public String getStringToShow() {
		return this.stringToShow;
	}
}
