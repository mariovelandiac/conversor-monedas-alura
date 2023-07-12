package strategies;

public interface ConversorStrategy {
		
	public double convertir(double amount);
	
	public void setConversionFactor();
	
	public String getUnits();
	
}
