package org.example.springcorefeaturespractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class SpringCoreFeaturesPracticeApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringCoreFeaturesPracticeApplication.class, args);

        System.out.println("---- All Bean in the application ---- ");
        String[] beanName = context.getBeanDefinitionNames();
        Arrays.sort(beanName);
        for(var bean : beanName) {
            System.out.println(bean);
        }
    }
}
