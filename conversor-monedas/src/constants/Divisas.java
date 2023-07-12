package constants;

public enum Divisas {
	COP("Pesos Colombianos", "COP"),
	USD("Dólares Estadounidenses", "USD");

	private String stringToShow;
	private String isoValue;

	Divisas(String stringToShow, String isoValue) {
		this.stringToShow = stringToShow;
		this.isoValue = isoValue;
	}

	public String getStringToShow() {
		return this.stringToShow;
	}
	
	public String getIsoValue() {
		return this.isoValue;
	}
}
