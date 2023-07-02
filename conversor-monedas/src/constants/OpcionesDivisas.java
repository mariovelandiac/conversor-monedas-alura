package constants;

public enum OpcionesDivisas implements ShowArrayStringText {
	
	COPtoUSD("Pesos colombianos (COP) y Dólar estadounidense (USD)", "COP-USD"),
	COPtoEUR("Pesos colombianos (COP) y Euros (EUR)", "COP-EUR"),
	COPtoGBP("Pesos colombianos (COP) y Libras Esterlinas (GBP)" , "COP-GBP"),
	COPtoJPY("Pesos colombianos (COP) y Yen Japonés (JPY)", "COP-JPY"),
	COPtoKRW("Pesos colombianos (COP) y Won sul-coreano (KRW)", "COP-KRW");

	private String stringToShow;
	private String shortValue;
	
	OpcionesDivisas(String stringToShow, String shortValue) {
		this.stringToShow = stringToShow;
		this.shortValue = shortValue;
	};
	
	public String getStringToShow() {
		return this.stringToShow;
	}
	
	public String getShortValue() {
		return this.shortValue;
	}
}
