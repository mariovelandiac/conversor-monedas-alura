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
		this.conversiones.put(OpcionesDivisas.COPtoUSD.getText(), new PesosADolaresStrategy());
		this.conversiones.put(OpcionesDivisas.COPtoEUR.getText(), new PesosAEurosStrategy());
		this.conversiones.put(OpcionesDivisas.COPtoGBP.getText(), new PesosALibrasExterlinas());
		this.conversiones.put(OpcionesDivisas.COPtoJPY.getText(), new PesosAYenJapones());
		this.conversiones.put(OpcionesDivisas.COPtoKRW.getText(), new PesosAWonSurcoreano());
		this.conversiones.put(OpcionesDivisas.USDtoCOP.getText(), new DolaresAPesosStrategy());
		this.conversiones.put(OpcionesDivisas.USDtoEUR.getText(), new DolaresAEurosStrategy());
		this.conversiones.put(OpcionesDivisas.USDtoGBP.getText(), new DolaresALibrasExterlinasStrategy());
		this.conversiones.put(OpcionesDivisas.USDtoJPY.getText(), new DolaresAYenJaponesStrategy());
		this.conversiones.put(OpcionesDivisas.USDtoKRW.getText(), new DolaresAWonSurcoreanoStrategy());
	}





}
