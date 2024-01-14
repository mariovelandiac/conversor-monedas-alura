package converter.constants;

public enum OpcionesVolumen implements OptionList {
	mlAl("De mililitros [ml] a litros [l]"),
	lAml("De litros [l] a [ml]");
	
	private String stringToShow;
	
	OpcionesVolumen(String stringToShow) {
		this.stringToShow = stringToShow;
	};
	
	public String getText() {
		return this.stringToShow;
	}
}
