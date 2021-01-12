package json;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public final class JsonReader {

	private JsonReader() {
	}

	public static final JSONObject getJsonFromURL(final String url) {

		final JSONParser parser = new JSONParser();

		try {

			final URL oracle = new URL(url);
			final URLConnection yc = oracle.openConnection();
			final BufferedReader in = new BufferedReader(new InputStreamReader(yc.getInputStream()));

			final JSONObject json = (JSONObject) parser.parse(in);

			return json;

		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}
}