package com.sarvan.learn.k8s;

import com.sarvan.learn.k8s.to.AppProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * Learn K8s using spring boot app
 */
@SpringBootApplication
@EnableConfigurationProperties(AppProperties.class)
public class K8sApplication {

    public static void main(String[] args) {
        SpringApplication.run(K8sApplication.class, args);
    }

}
