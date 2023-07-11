package constants;

public enum OpcionesConversor implements OptionList {
	Divisas("Conversor de Divisas");
	// Temperatura("Conversor de Unidades de Temperatura"),
	// Volumen("Conversor de Unidades de Volumen");
	
	private String stringToShow;
	
	OpcionesConversor(String stringToShow) {
		this.stringToShow = stringToShow;
	}
	
	public String getStringToShow() {
		return this.stringToShow;
	}

}
