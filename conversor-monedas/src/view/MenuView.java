package view;

import javax.swing.JOptionPane;

import constants.InfoText;

public abstract class MenuView {
	
	public String mostrarOpciones(String[] opciones, String textToShow) {
		Object selectedOption = JOptionPane.showInputDialog(null,
				textToShow,
				"Input",
				JOptionPane.INFORMATION_MESSAGE,
				null,
				opciones,
				opciones[0]
			);
			if (selectedOption == null) {
				throw new IllegalArgumentException("No se seleccionó ninguna opción");
			}
			return selectedOption.toString();	
	}
	
	public String leerEntrada() {
		Object amount = JOptionPane.showInputDialog(InfoText.InputAmount.getStringToShow());
		return amount.toString();
	}

	public void mostrarResultado(String respuesta, String unidades) {
		JOptionPane.showMessageDialog(null,
				respuesta + " " + unidades,
				"Resultado",
				JOptionPane.INFORMATION_MESSAGE);
	}
	
	public void mostrarMensajeError(String message) {
		JOptionPane.showMessageDialog(null,
				message,
				"Error",
				JOptionPane.ERROR_MESSAGE);
	}
	
	
}
