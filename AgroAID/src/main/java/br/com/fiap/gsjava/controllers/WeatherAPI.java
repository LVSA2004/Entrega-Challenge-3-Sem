package br.com.fiap.gsjava.controllers;

import net.aksingh.owmjapis.core.OWM;
import net.aksingh.owmjapis.api.APIException;
import net.aksingh.owmjapis.model.CurrentWeather;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/clima")
public class WeatherAPI {
    private OWM owm = new OWM("Sua Chave da API aqui");

    @GetMapping("/{city}")
    public CurrentWeather getWeatherByCity(@PathVariable String city) throws APIException {
        return owm.currentWeatherByCityName(city);
    }
}

