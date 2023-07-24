package converter.constants;

public enum UnidadesTemperatura {
	
	Cel("grados Centigrados"),
	Farh("grados Fahrenheit"),
	Kel("Kelvin"),
	Ran("Ranking");
	
	private String stringToShow;
	
	UnidadesTemperatura(String stringToShow) {
		this.stringToShow = stringToShow;
	}

	public String getStringToShow() {
		return this.stringToShow;
	}
}
