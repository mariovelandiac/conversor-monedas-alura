import view.*;
import constants.InfoText;
import controllers.*;
import models.MenuInicialModel;
import utils.RestartConversion;

public class ChallengeLauncher {
	public static void main(String[] args) {
		boolean shouldExit = false;

		while (!shouldExit) {

			MenuInicialView menuView = createMenuInicialView();
			MenuInicialModel menuModel = createMenuInicialModel();
			MenuInicialController menu = createMenuInicialController(menuView, menuModel);
			try {
				menu.launch();
			} catch (RestartConversion restart) {
				continue;
			} catch (Exception e) {
				menuView.mostrarMensajeError(InfoText.ErrorInesperado.getStringToShow());
			}
			shouldExit = true;
		}
	}

	private static MenuInicialView createMenuInicialView() {
		return new MenuInicialView();
	}

	private static MenuInicialModel createMenuInicialModel() {
		return new MenuInicialModel();
	}

	private static MenuInicialController createMenuInicialController(MenuInicialView menuView,
			MenuInicialModel menuModel) {
		return new MenuInicialController(menuView, menuModel);
	}
}
