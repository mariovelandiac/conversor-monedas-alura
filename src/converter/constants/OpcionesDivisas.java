package converter.constants;

public enum OpcionesDivisas implements OptionList {
	
	COPtoUSD("De Pesos colombianos (COP) a Dólar estadounidense (USD)"),
	COPtoEUR("De Pesos colombianos (COP) a Euros (EUR)"),
	COPtoGBP("De Pesos colombianos (COP) a Libras Esterlinas (GBP)"),
	COPtoJPY("De Pesos colombianos (COP) a Yen Japonés (JPY)"),
	COPtoKRW("De Pesos colombianos (COP) a Won surcoreano (KRW)"),
	USDtoCOP("De Dólar estadounidense (USD) a Pesos colombianos (COP)"),
	USDtoEUR("De Dólar estadounidense (USD) a Euros (EUR)"),
	USDtoGBP("De Dólar estadounidense (USD) a Libras Esterlinas (GBP)"),
	USDtoJPY("De Dólar estadounidense (USD) a Yen Japonés (JPY)"),
	USDtoKRW("De Dólar estadounidense (USD) a Won sul-coreano (KRW)");
	/* 
	EURtoCOP("De Euros (EUR) a Pesos colombianos (COP)"),
	EURtoUSD("De Euros (EUR) a Dólar estadounidense (USD)"),
	EURtoGBP("De Euros (EUR) a Libras Esterlinas (GBP)"),
	EURtoJPY("De Euros (EUR) a Yen Japonés (JPY)"),
	EURtoKRW("De Euros (EUR) a Won surcoreanos (KRW)"),
	GBPtoCOP("De Libras Esterlinas (GBP) a Pesos colombianos (COP)"),
	GBPtoUSD("De Libras Esterlinas (GBP) a Dólar estadounidense (USD)"),
	GBPtoEUR("De Libras Esterlinas (GBP) a Euros (EUR)"),
	GBPtoJPY("De Libras Esterlinas (GBP) a Yen Japonés (JPY)"),
	GBPtoKRW("De Libras Esterlinas (GBP) a Won surcoreano (KRW)"),
	JPYtoCOP("De Yen Japonés (JPY) a Pesos colombianos (COP)"),
	JPYtoUSD("De Yen Japonés (JPY) a Dólar estadounidense (USD)"),
	JPYtoEUR("De Yen Japonés (JPY) a Euros (EUR)"),
	JPYtoGBP("De Yen Japonés (JPY) a De Libras Esterlinas (GBP)"),
	JPYtoKRW("De Yen Japonés (JPY) a Won surcoreano (KRW)"),
	KRWtoCOP("Won surcoreano (KRW) a Pesos colombianos (COP)"),
	KRWtoUSD("Won surcoreano (KRW) a Dólar estadounidense (USD)"),
	KRWtoEUR("Won surcoreano (KRW) a Euros (EUR)"),
	KRWtoGBP("Won surcoreano (KRW) a De Libras Esterlinas (GBP)"),
	KRWtoKRW("Won surcoreano (KRW) a De Yen Japonés (JPY)"); 
	*/

	private String stringToShow;
	
	OpcionesDivisas(String stringToShow) {
		this.stringToShow = stringToShow;
	};
	
	public String getText() {
		return this.stringToShow;
	}
	
}
