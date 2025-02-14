package br.com.fiap.services;

import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

import com.google.gson.Gson;

import br.com.fiap.model.Planeta;

public class PlanetaSWService {

	// metodo
	public Planeta getPlaneta(String p) throws ClientProtocolException, IOException {

		Planeta planeta = null;

		// request
		HttpGet request = new HttpGet("https://swapi.dev/api/planets" + p);

		// Client
		CloseableHttpClient httpClient = HttpClientBuilder.create().disableRedirectHandling().build();

		// Response
		CloseableHttpResponse response = httpClient.execute(request);

		// Entity
		HttpEntity entity = response.getEntity();

		if (entity != null) {

			String result = EntityUtils.toString(entity);

			Gson gson = new Gson();

			planeta = gson.fromJson(result, Planeta.class);
		}

		return planeta;
	}

}
