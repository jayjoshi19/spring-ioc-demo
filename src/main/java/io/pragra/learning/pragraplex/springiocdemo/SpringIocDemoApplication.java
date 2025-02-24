package io.pragra.learning.pragraplex.springiocdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//@SpringBootApplication
public class SpringIocDemoApplication {

    public static void main(String[] args) {
//        SpringApplication.run(SpringIocDemoApplication.class, args);

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Honda crv = context.getBean("crv",Honda.class);
        Honda civic = context.getBean("civic",Honda.class);

        System.out.println(crv);
        System.out.println(civic);

        Student student = context.getBean("student", Student.class);
        System.out.println(student);


    }

}
