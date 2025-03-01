package io.pragra.learning.pragraplex.springiocdemo.anotherConfigPkg;

import io.pragra.learning.pragraplex.springiocdemo.Laptop;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig3 {

    @Bean
    public Laptop laptop(){
        return new Laptop("Acer", 725);
    }
}
