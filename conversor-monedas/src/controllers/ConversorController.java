package controllers;

import utils.RestartConversion;

public abstract class ConversorController {
	
	public abstract void launch() throws RestartConversion;
	protected abstract void inicializarConversiones();
	public abstract void realizarConversion(double amount);
}
