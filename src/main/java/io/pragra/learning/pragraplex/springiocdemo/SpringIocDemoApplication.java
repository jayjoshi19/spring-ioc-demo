package io.pragra.learning.pragraplex.springiocdemo;

import io.pragra.learning.pragraplex.springiocdemo.config.AppConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//@SpringBootApplication
public class SpringIocDemoApplication {

    public static void main(String[] args) {
//        SpringApplication.run(SpringIocDemoApplication.class, args);

        //ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        ApplicationContext context = new AnnotationConfigApplicationContext("io.pragra.learning.pragraplex.springiocdemo.config",
                "io.pragra.learning.pragraplex.springiocdemo.anotherConfigPkg");
//        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Honda crv = context.getBean("crv",Honda.class);
        Honda civic = context.getBean("civic",Honda.class);

        System.out.println(crv);
        System.out.println(civic);

        /*Student student = context.getBean("student", Student.class);
        System.out.println(student);*/

        Employee employee = context.getBean("employee",Employee.class);
        System.out.println(employee);

        Laptop laptop = context.getBean("laptop",Laptop.class);
        System.out.println(laptop);

//        DBConnection con = context.getBean("mysql",DBConnection.class);
//        System.out.println(con);

        // to use this method, we need to use ConfigurableApplicationContext interface
        //context.registerShutdownHook();
    }

}