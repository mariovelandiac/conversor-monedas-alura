package converter.controllers;

import converter.factory.OpcionConversorFactory;
import converter.models.MenuInicialModel;
import converter.utils.RestartConversion;
import converter.view.MenuInicialView;

public class MenuInicialController extends Controller {
	

	public MenuInicialController(MenuInicialModel model, MenuInicialView view) {
		super(model, view);
	}

	@Override
	public void start(String selected) throws RestartConversion {
		Controller controller = OpcionConversorFactory.createController(selected);
		controller.launch();
	}

}
