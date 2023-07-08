package view;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

import constants.OpcionesConversor;

public class MenuInicialView implements MenuView {

	@Override
	public Object mostrarOpciones(String[] opciones) {
		Object selectedOption = JOptionPane.showInputDialog(null,
			"Seleccione el Conversor Deseado",
			"Input",
			JOptionPane.INFORMATION_MESSAGE,
			null,
			opciones,
			opciones[0]
		);
		return selectedOption
				;
		
	}

}
