package com.edigest.jourmalApp.service;

import com.edigest.jourmalApp.api.response.WeatherResponse;
import com.edigest.jourmalApp.cache.AppCache;
import com.edigest.jourmalApp.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {

    @Value("${weather.api.key}")  // ✅ fixed syntax and removed static
    private String apiKey;

//    private static final String API = "http://api.weatherstack.com/current?access_key=API_KEY&query=CITY";

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private AppCache appCache;

    public WeatherResponse getWheather(String city) {
        String finalAPI = appCache.APP_CACHE.get("weather_api").replace("<city>", city).replace("<apiKey>", apiKey);
        ResponseEntity<WeatherResponse> response = restTemplate.exchange(finalAPI, HttpMethod.GET, null, WeatherResponse.class);
        WeatherResponse body = response.getBody();
        return body;
    }
}

//               Use This For Post Call
//String finalAPI = API.replace("CITY", city).replace("API_KEY", apiKey);
//
//        // String requestBody = "{\"username\":\"om\", \"password\":\"om\"}";
//HttpHeaders htttpHeaders = new HttpHeaders();
//        htttpHeaders.set("key", "value");
//User user = User.builder().username("om").password("om").build();
//HttpEntity<User> httpEntity = new HttpEntity<>(user, htttpHeaders);
//
//ResponseEntity<WeatherResponse> response = restTemplate.exchange(finalAPI, HttpMethod.POST, httpEntity, WeatherResponse.class);
