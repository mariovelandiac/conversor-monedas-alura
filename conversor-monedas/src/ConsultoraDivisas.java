
import java.net.URL;
import java.util.Scanner;
import java.net.HttpURLConnection;


// have=USD&want=EUR&amount=5000"

public class ConsultoraDivisas {

	private static String apiUri = "https://api.api-ninjas.com/v1/convertcurrency?";
	private static String method = "GET";
	private String apiQuery;

	public void setApiQuery(String have, String want, String amount) {
		this.apiQuery = apiUri + "have=" + have + "&want=" + want + "&amount=" + amount;
	}

	public void convertCurrency(String have, String want, String amount) {
		this.setApiQuery(have, want, amount);
		ConsultoraDivisas.consumApi(this.apiQuery);
		// System.out.println(res);
	}

	private static void consumApi(String apiUri) {
		try {
			
			// Consumo api
			URL url = new URL(apiUri);
			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod(method);
			connection.connect();
			
			// Validacion respuesta exitosa
			int statusCode = connection.getResponseCode();
			if (statusCode != 200) {
				throw new RuntimeException("Codigo de respuesta: " + statusCode);
			}
			
			StringBuilder informationString = new StringBuilder();
			Scanner scanner = new Scanner(url.openStream());
			
			while (scanner.hasNext()) {
				informationString.append(scanner.nextLine());
			}
			scanner.close();
			System.out.println(informationString);
			

		} catch (Exception e) {
			System.out.println(e);
		}
	}

}