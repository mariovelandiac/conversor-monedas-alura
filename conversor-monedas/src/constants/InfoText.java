package constants;

public enum InfoText {
	MenuInicial("Escoja el tipo de conversor a utilizar"),
	ConvDivisas("Escoja las monedas entre las que desea realizar la conversión"),
	ConvTemperatura("Escoja las unidades de temperatura entre las que desea realizar la conversión"),
	InputAmount("Ingrese el valor a convertir separado por un punto en caso de ser necesario"),
	ErrorDoubleInput("Debe ingresar un valor númerico"),
	ErrorOptionSelected("No se seleccionó ninguna opción"),
	ErrorNonAmountSelected("No se ingresó ningún valor"),
	ErrorInvalidOption("Opcion de conversión Invalida"),
	ErrorInesperado("Ha ocurrido un error inesperado"),
	DeseaContinuar("¿Desea continuar con otra conversión?"),
	CerrarConversion("Programa Finalizado");
	
	private String stringToShow;

	InfoText(String stringToShow) {
		this.stringToShow = stringToShow;
	}

	public String getStringToShow() {
		return this.stringToShow;
	}
}
