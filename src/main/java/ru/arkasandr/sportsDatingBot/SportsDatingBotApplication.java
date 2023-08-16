package ru.arkasandr.sportsDatingBot;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class SportsDatingBotApplication {
    public static void main(String[] args) {
        SpringApplication.run(ru.arkasandr.sportsDatingBot.SportsDatingBotApplication.class, args);
    }
}
