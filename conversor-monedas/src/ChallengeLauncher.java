import view.*;
import controllers.*;
import models.MenuInicialModel;

public class ChallengeLauncher {
	public static void main(String[] args) {
		MenuInicialView menuInicial = new MenuInicialView();
		MenuInicialModel menuModel = new MenuInicialModel();
		MenuInicialController menu = new MenuInicialController(menuInicial, menuModel);
		menu.launch();
	}
}
