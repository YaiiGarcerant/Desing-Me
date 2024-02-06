package com.example.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Apirest{
    @GetMapping("/sumar")
    public int sumar(@RequestParam("numero1") int numero1, @RequestParam("numero2") int numero2) {
        return numero1 * numero2;

}
}