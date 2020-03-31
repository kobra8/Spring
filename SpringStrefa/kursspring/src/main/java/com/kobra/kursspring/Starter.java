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
    @Autowired
    Castle castle;

    @Override
    public void run(String... args) throws Exception {

        System.out.println(castle);

    //  Dependency injection - przekazywanie przez konstruktor
        Quest saveThePincess = new Quest("Uratuj księżniczkę");
        Knight lancelot = new Knight("Lancelot", 29, saveThePincess);

        //  Dependency injection - przekazywanie przez metodę
        Quest killTheDragon = new Quest("Zabij smoka");
        Knight percival = new Knight("Percival", 31);
        percival.setQuest(killTheDragon);

        System.out.println(lancelot);
        System.out.println(percival);
    }
}
