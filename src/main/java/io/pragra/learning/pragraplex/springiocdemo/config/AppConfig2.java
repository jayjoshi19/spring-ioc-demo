package io.pragra.learning.pragraplex.springiocdemo.config;

import io.pragra.learning.pragraplex.springiocdemo.Employee;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig2 {

    @Bean(initMethod = "initialize")
    public Employee employee(){
        return new Employee("Jay", "Joshi");
    }
}
