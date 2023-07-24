package converter.constants;

public enum UnidadesVolumen implements OptionList {
	
	ml("mililiitros"),
	l("litros");
	
	private String stringToShow;
	
	UnidadesVolumen(String string) {
		this.stringToShow = string;
	}
	
	public String getStringToShow() {
		return this.stringToShow;
	}

}
