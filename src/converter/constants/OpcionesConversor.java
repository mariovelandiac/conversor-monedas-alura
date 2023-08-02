package converter.constants;

public enum OpcionesConversor implements OptionList {
	Divisas("Conversor de Divisas"),
	Temperatura("Conversor de Unidades de Temperatura"),
	Volumen("Conversor de Unidades de Volumen");
	// Masa("Conversor de Unidades de Masa"),
	// Presion("Conversor de Unidades de Presión");
	
	private String stringToShow;
	
	OpcionesConversor(String stringToShow) {
		this.stringToShow = stringToShow;
	}
	
	public String getText() {
		return this.stringToShow;
	}

}
