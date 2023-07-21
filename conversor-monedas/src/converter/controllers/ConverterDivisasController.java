package converter.controllers;

import converter.constants.OpcionesDivisas;
import converter.models.Model;
import converter.strategies.currency.*;
import converter.view.View;

public class ConverterDivisasController extends ConverterController {

	public ConverterDivisasController(Model model, View view) {
		super(model, view);
	}
	
	@Override
	public void inicializarConversiones() {
		this.conversiones.put(OpcionesDivisas.COPtoUSD.getStringToShow(), new PesosADolaresStrategy());
		this.conversiones.put(OpcionesDivisas.COPtoEUR.getStringToShow(), new PesosAEurosStrategy());
		this.conversiones.put(OpcionesDivisas.COPtoGBP.getStringToShow(), new PesosALibrasExterlinas());
		this.conversiones.put(OpcionesDivisas.COPtoJPY.getStringToShow(), new PesosAYenJapones());
		this.conversiones.put(OpcionesDivisas.COPtoKRW.getStringToShow(), new PesosAWonSurcoreano());
	}





}
