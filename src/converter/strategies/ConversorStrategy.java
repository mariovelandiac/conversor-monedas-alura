package converter.strategies;

public interface ConversorStrategy {
		
	public String convertir(double amount) throws Exception;
	
	public void setNewAmount(double amount) throws Exception;
	
	public String getUnits();
	
	public void close();
	
	public double getNewAmount();
	
}
