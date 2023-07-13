package view;

import javax.swing.JOptionPane;

import constants.InfoText;

public abstract class View {
	
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
				throw new IllegalArgumentException(InfoText.ErrorOptionSelected.getStringToShow());
			}
			return selectedOption.toString();	
	}
	
	public String leerEntrada() {
		Object amount = JOptionPane.showInputDialog(InfoText.InputAmount.getStringToShow());
		if (amount == null) {
			throw new IllegalArgumentException(InfoText.ErrorNonAmountSelected.getStringToShow());
		}
		return amount.toString();
	}

	public void mostrarResultado(String respuesta, String unidades) {
		JOptionPane.showMessageDialog(null,
				respuesta + " " + unidades,
				"Resultado de la Conversión",
				JOptionPane.INFORMATION_MESSAGE);
	}
	
	public void mostrarMensajeError(String message) {
		JOptionPane.showMessageDialog(null,
				message,
				"Error",
				JOptionPane.ERROR_MESSAGE);
	}
	
	public void mostrarMensajeInformacion(String message) {
		JOptionPane.showMessageDialog(null,
				message,
				"Info",
				JOptionPane.INFORMATION_MESSAGE);
	}
	
	public int mostrarConfirmacionSalida() {
		int optionSelected = JOptionPane.showConfirmDialog(null, 
				InfoText.DeseaContinuar.getStringToShow(), 
				"Input", 
				JOptionPane.YES_NO_CANCEL_OPTION);
		return optionSelected;
	}
	
	
}
