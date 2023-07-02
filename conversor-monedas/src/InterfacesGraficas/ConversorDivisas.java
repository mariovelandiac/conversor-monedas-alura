package InterfacesGraficas;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import constants.OpcionesDivisas;
import constants.ShowArrayStringText;

public class ConversorDivisas {
	
	private OpcionesDivisas[] opciones;
	
	public ConversorDivisas() {
		this.opciones = OpcionesDivisas.values();
	}
	
	public void Launch() {

		String option = this.menuInicial();
		System.out.println(option);
	}
	
	private String menuInicial() {
		try {
			// Crear Array de Textos Largos
			String[] opcionesTexto = new String[this.opciones.length];
			for (int i = 0; i < this.opciones.length; i++) {
				opcionesTexto[i] = opciones[i].getStringToShow();
			}
			
			// Mostrar cuadro de Dialogo
			int selectedOption = JOptionPane.showOptionDialog(
		            null,
		            "Escoja la pareja de Monedas sobre las que desea hacer un intercambio",
		            "Input",
		            JOptionPane.DEFAULT_OPTION,
		            JOptionPane.INFORMATION_MESSAGE,
		            null,
		            opcionesTexto,
		            opcionesTexto[0]
		        );
					
			if (selectedOption == JOptionPane.CLOSED_OPTION) {
				throw new IllegalArgumentException("No se seleccionó ninguna opción.");
			}
			String shortValue = this.opciones[selectedOption].getShortValue();

			return shortValue;
			
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("Ocurrió un error al mostrar el menú principal.", e);
		}
	};

	
}
