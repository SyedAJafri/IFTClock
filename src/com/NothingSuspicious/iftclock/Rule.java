package com.NothingSuspicious.iftclock;

import com.survivingwithandroid.weather.lib.WeatherClient;
import com.survivingwithandroid.weather.lib.WeatherConfig;
import com.survivingwithandroid.weather.lib.provider.forecastio.ForecastIOProviderType;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class Rule extends Activity {
	private static final int WEATHER = 0;
	int ruleType;
	WeatherClient.ClientBuilder builder;
	WeatherConfig config;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_rule);
		
		builder = new WeatherClient.ClientBuilder();
		config = new WeatherConfig();
		WeatherClient client = builder.attach(this)
	            .provider(new ForecastIOProviderType())
	            .httpClient(com.survivingwithandroid.weather.lib.client.okhttp.WeatherDefaultClient.class)
	            .config(config)
	            .build();
		
		this.ruleType = WEATHER; /*TODO grab from savedInstanceState */
	}
}
