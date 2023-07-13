package strategies;

import java.io.IOException;

public interface ConversorStrategy {
		
	public double convertir(double amount) throws IOException;
	
	public void setNewAmount(double amount) throws IOException;
	
	public String getUnits();
	
	public void close();
	
}
