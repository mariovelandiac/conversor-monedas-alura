package converter.constants;
/**
 * InfoText alamacena los mensajes que son mostrados en los cuadros de texto
 * @version 1.0.0
 * @author mariovelandiac <mariovelandiawork@gmail.com>
 */
public enum InfoText implements OptionList {
	MenuInicial("Escoja el tipo de conversor a utilizar"),
	ConvDivisas("Escoja las monedas entre las que desea realizar la conversión"),
	ConvTemperatura("Escoja las unidades de temperatura entre las que desea realizar la conversión"),
	ConvVolumen("Escoja las unidades de volumen entre las que desea realizar la conversión"),
	InputAmount("Ingrese el valor a convertir separado por un punto en caso de ser necesario"),
	ErrorDoubleInput("Debe ingresar un valor númerico"),
	ErrorOptionSelected("No se seleccionó ninguna opción"),
	ErrorNonAmountSelected("No se ingresó ningún valor"),
	ErrorInvalidOption("Opcion de conversión Invalida"),
	ErrorInesperado("Ha ocurrido un error inesperado"),
	DeseaContinuar("¿Desea continuar con otra conversión?"),
	CerrarConversion("Programa Finalizado");
	
	private String text;

	InfoText(String stringToShow) {
		this.text = stringToShow;
	}
	
	/**
	 * Este método retorna el String que alamacena cada referencia del mensaje a mostrar
	 */
	public String getText() {
		return this.text;
	}
}
