package br.com.rsfot.sportarticles.home;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class HelloWordController {

    @GetMapping("/")
    public Map<String, String> helloWord() {
        return Map.of("message", "Hello World! From Sport Articles API.");
    }
}
