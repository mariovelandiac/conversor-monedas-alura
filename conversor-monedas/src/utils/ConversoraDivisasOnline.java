package utils;

import java.net.URL;
import java.util.Scanner;
import java.io.IOException;
import java.net.HttpURLConnection;


public class ConversoraDivisasOnline implements AutoCloseable {

	private static final String apiUri = "https://api.api-ninjas.com/v1/convertcurrency?";
	private static final String method = "GET";
	private String apiQuery;
	private HttpURLConnection connection;

	private void setApiQuery(String have, String want, String amount) {
		this.apiQuery = apiUri + "have=" + have + "&want=" + want + "&amount=" + amount;
	}

	private String getApiQuery() {
		return this.apiQuery;
	}

	public double convertCurrency(String have, String want, double amount) throws IOException {
		this.setApiQuery(have, want, String.valueOf(amount));
		double conversionFactor = this.convertOnline(this.getApiQuery());
		return conversionFactor;
	}

	private double convertOnline(String apiUri) throws IOException {
		try {
			URL url = new URL(apiUri);
			connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod(method);
			connection.connect();

			// Validacion respuesta exitosa
			int statusCode = connection.getResponseCode();
			if (statusCode != HttpURLConnection.HTTP_OK) {
				throw new IOException("Codigo de respuesta: " + statusCode);
			}

			StringBuilder informationString = new StringBuilder();
			try (Scanner scanner = new Scanner(url.openStream())) {
				while (scanner.hasNext()) {
					informationString.append(scanner.nextLine());
				}
			}
			return this.parseResponse(informationString.toString());
		} catch (IOException e) {
			throw new IOException("Error al convertir la moneda, " + e.getMessage());
		}
	}

	private double parseResponse(String jsonString) {
		int startIndex = jsonString.indexOf("\"new_amount\":") + "\"new_amount\":".length();
		int endIndex = jsonString.indexOf(",", startIndex);

		if (endIndex == -1) {
			endIndex = jsonString.indexOf("}", startIndex);
		}

		String newAmountString = jsonString.substring(startIndex, endIndex);
		double newAmount = Double.parseDouble(newAmountString);

		return newAmount;
	}

	@Override
	public void close() {
		if (connection != null) {
			connection.disconnect();
		}
	}

}
