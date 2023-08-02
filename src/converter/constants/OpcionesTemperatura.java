package converter.constants;

public enum OpcionesTemperatura implements OptionList {
	
	CelToFarh("De grados Centigrados [°C] a grados Fahrenheit [°F]"),
	FarhToCel("De grados Fahrenheit [°F] a grados Centigrados [°C]");
	/* 
	CelToKel("De grados Centigrados [°C] a Kelvin [K]"),
	KelToCel("De Kelvin [K] a grados Centigrados [°C]"),
	FarhToRan("De grados Fahrenheit [°F] a Rankine [R]"),
	RanToFarh("De Rankine [R] a grados Fahrenheit [°F]"),
	KelToRan("De Kelvin [K] a Rankine [R]"),
	RanToKel("De Rankine [R] a Kelvin [K]");
	*/
	
	private String stringToShow;
	
	OpcionesTemperatura(String stringToShow) {
		this.stringToShow = stringToShow;
	};
	
	public String getText() {
		return this.stringToShow;
	}
}
