package view;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import constants.OpcionesDivisas;
import constants.ShowArrayStringText;

public class ConversorDivisasView implements ConversorView {
	
	private OpcionesDivisas[] opciones;
	
	private double valor;

	@Override
	public void leerEntrada() {
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
			
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("Ocurrió un error al mostrar el menú principal.", e);
		}
	}

	@Override
	public void mostrarResultado(double resultado) {
		// TODO Auto-generated method stub
		
	};

	
}
