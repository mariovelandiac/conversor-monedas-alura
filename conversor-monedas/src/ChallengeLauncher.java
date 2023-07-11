import view.*;
import controllers.*;
import models.MenuInicialModel;

public class ChallengeLauncher {
	public static void main(String[] args) {
		MenuInicialView menuView = createMenuInicialView();
		MenuInicialModel menuModel = createMenuInicialModel();
		MenuInicialController menu = createMenuInicialController(menuView, menuModel);
		menu.launch();
	}
	
	private static MenuInicialView createMenuInicialView() {
		return new MenuInicialView();
	}
	
	private static MenuInicialModel createMenuInicialModel() {
		return new MenuInicialModel();
	}
	
	private static MenuInicialController createMenuInicialController(MenuInicialView menuView, MenuInicialModel menuModel) {
		return new MenuInicialController(menuView, menuModel);
	}
}
