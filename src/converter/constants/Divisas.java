package converter.constants;

public enum Divisas {
	COP("Pesos Colombianos", "COP"),
	USD("Dólares Estadounidenses", "USD"),
	EUR("Euros", "EUR"),
	GBP("Libras Esterlinas", "GBP"),
	JPY("Yen Japonés", "JPY"),
	KRW("Won Surcoreano", "KRW");
	

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
