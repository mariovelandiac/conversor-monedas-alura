package converter.constants;

public enum UnidadesTemperatura implements OptionList {
	
	Cel("° Centigrados"),
	Farh("° Fahrenheit"),
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
