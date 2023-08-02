package converter.view;

import javax.swing.JOptionPane;

import converter.constants.InfoText;

public abstract class View {
	
	protected String title;
	
	public View(String title) {
		this.title = title;
	}
	
	public String mostrarOpciones(String[] opciones, String textToShow) {
		Object selectedOption = JOptionPane.showInputDialog(null,
				textToShow,
				this.title,
				JOptionPane.INFORMATION_MESSAGE,
				null,
				opciones,
				opciones[0]
			);
			if (selectedOption == null) {
				throw new IllegalArgumentException(InfoText.ErrorOptionSelected.getText());
			}
			return selectedOption.toString();	
	}
	
	public String leerEntrada() {
		Object amount = JOptionPane.showInputDialog(InfoText.InputAmount.getText());
		if (amount == null) {
			throw new IllegalArgumentException(InfoText.ErrorNonAmountSelected.getText());
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
				InfoText.DeseaContinuar.getText(), 
				"Input", 
				JOptionPane.YES_NO_CANCEL_OPTION);
		return optionSelected;
	}
	
	
}
