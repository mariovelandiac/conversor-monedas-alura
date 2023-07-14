package controllers;

import factory.OpcionConversorFactory;
import models.MenuInicialModel;
import utils.RestartConversion;
import view.MenuInicialView;

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
