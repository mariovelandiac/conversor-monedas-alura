package view;

import javax.swing.JOptionPane;

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
}
