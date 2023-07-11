package controllers;

public abstract class ConversorController {
	
	public abstract void launch();
	protected abstract void inicializarConversiones();
	public abstract void realizarConversion();
}
