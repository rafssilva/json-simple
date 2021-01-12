package json;

import javax.swing.JOptionPane;
import org.json.simple.JSONObject;

public class Main {

	public static void main(String[] args) {

		final String cep = JOptionPane.showInputDialog("Informe o CEP"); // Meu cep para teste 21635270

		final String url = "https://my-json-server.typicode.com/rafssilva/cep-json/" + cep;

		final JSONObject json = JsonReader.getJsonFromURL(url);

		if (json != null) {

			System.out.println("--- JSON ---");
			System.out.println(json);
			System.out.println("Logradouro: " + json.get("logradouro"));
			System.out.println("Bairro: " + json.get("bairro"));
			final String bairro = (String) json.get("bairro");
			System.out.println("String Bairro: " + bairro);
			System.out.println("Município: " + json.get("municipio"));

		} else {
			System.out.println("URL INVÁLIDA");
		}
	}
}