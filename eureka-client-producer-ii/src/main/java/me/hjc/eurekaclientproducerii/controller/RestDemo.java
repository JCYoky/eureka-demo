package me.hjc.eurekaclientproducerii.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class RestDemo {

    @GetMapping("/info-ii")
    public String getSomeInfo() {
        return this.produceInfo().map(String::toUpperCase).orElse("No information");
    }

    private Optional<String> produceInfo() {
        return Optional.of("This information comes from eureka micro-service-ii");
    }
}
