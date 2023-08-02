package converter.constants;

public enum UnidadesTemperatura implements OptionList {
	
	Cel("grados Centigrados"),
	Farh("grados Fahrenheit"),
	Kel("Kelvin"),
	Ran("Ranking");
	
	private String stringToShow;
	
	UnidadesTemperatura(String stringToShow) {
		this.stringToShow = stringToShow;
	}

	public String getText() {
		return this.stringToShow;
	}
}
