package constants;

public enum OpcionesTemperatura implements OptionList {
	
	CelToFarh("De grados Centigrados [°C] a grados Fahrenheit [°F]");
	
	private String stringToShow;
	
	OpcionesTemperatura(String stringToShow) {
		this.stringToShow = stringToShow;
	};
	
	public String getStringToShow() {
		return this.stringToShow;
	}
}
