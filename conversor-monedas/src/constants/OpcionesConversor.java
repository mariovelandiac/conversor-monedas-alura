package constants;

public enum OpcionesConversor implements ShowArrayStringText {
	Divisas("Conversor de Divisas"),
	Temperatura("Conversor de Unidades de Temperatura");
	
	private String stringToShow;
	
	OpcionesConversor(String stringToShow) {
		this.stringToShow = stringToShow;
	}
	
	public String getStringToShow() {
		return this.stringToShow;
	}

	@Override
	public String getShortValue() {
		// TODO Auto-generated method stub
		return null;
	}
}
