package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {
    private final AtomicLong counter = new AtomicLong();

    // Define que o endpoint será o "/pessoa"
    @GetMapping("/pessoa")
    public List<Pessoa> pessoa1() {

        //Essa pessoa coloca os parametros e os transforma para formato JSON
        Pessoa pessoa1 = new Pessoa(counter.incrementAndGet());
        Pessoa pessoa2 = new Pessoa(counter.incrementAndGet());

        return Arrays.asList(pessoa1,pessoa2);
    }

    @GetMapping("/conta")
    public List<ContaBancaria> conta1(){
        ContaBancaria conta1 = new ContaBancaria("32",20);
        ContaBancaria conta2 = new ContaBancaria("37",2220);
        return Arrays.asList(conta1,conta2);
    }
}