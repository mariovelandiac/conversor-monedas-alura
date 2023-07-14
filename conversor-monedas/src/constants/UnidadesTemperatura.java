package constants;

public enum UnidadesTemperatura {
	
	Cel("Grados Centigrados"),
	Farh("Grados Fahrenheit");
	
	private String stringToShow;
	
	UnidadesTemperatura(String stringToShow) {
		this.stringToShow = stringToShow;
	}

	public String getStringToShow() {
		return this.stringToShow;
	}
}
