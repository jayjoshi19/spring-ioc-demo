package io.pragra.learning.pragraplex.springiocdemo.config;

import io.pragra.learning.pragraplex.springiocdemo.Employee;
import io.pragra.learning.pragraplex.springiocdemo.Honda;
import io.pragra.learning.pragraplex.springiocdemo.HydraulicBrake;
import io.pragra.learning.pragraplex.springiocdemo.MechanicalBrake;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean (initMethod = "initialize")
    public Honda crv(){
        Honda honda = new Honda("Petrol Engine", "crv", mechBrake());
        return honda;
    }

    @Bean (initMethod = "initialize")
    public MechanicalBrake mechBrake(){
        MechanicalBrake mechBrake = new MechanicalBrake();
        return mechBrake;
    }

    @Bean
    public Honda civic(){
        Honda civic = new Honda("Diesel Engine", "Civic", hydraulicBrake());
        return civic;
    }

    @Bean (initMethod = "initialize")
    public HydraulicBrake hydraulicBrake(){
        return new HydraulicBrake();
    }

    @Bean
    public String abc(){
        return "abc";
    }

    @Bean
    public String xyz(){
        return "xyz";
    }

    @Bean
    public String test(){
        return "test";
    }

    @Bean
    public String firstName(){
        return "Jay";
    }

    public Employee employee1(){
        return new Employee("Jay");
    }

    public Employee employee2(){
        return new Employee("Sachin");
    }
}
