package com.kobra.kursspring;

import com.kobra.kursspring.domain.Castle;
import com.kobra.kursspring.domain.Knight;
import com.kobra.kursspring.domain.Quest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Starter implements CommandLineRunner {

    // Dzięki adnotacji autowired możemy do komponentów springowych wstrzykiwać inne komponenty springowe
    // Wstrzykiwanie zależności za pomocą Reflection API
    @Autowired
    Castle castle;

    @Override
    public void run(String... args) throws Exception {

        System.out.println(castle);


    }
}
