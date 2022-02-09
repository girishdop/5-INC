package com.example.demo1;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }



    @Bean
    CommandLineRunner runner(userRepository repository) {
        return args->{

            ExpenseCategory expensecategory = new ExpenseCategory(1,2,3,4,5,6,7,8,9,0


            );
            user fa = new user(Role.FA,"sudha","poopa", Gender.FEMALE, 12,expensecategory,"ppp",claim.C1

            );
            repository.insert(fa);

        };
    }
}
