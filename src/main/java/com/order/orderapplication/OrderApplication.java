package com.order.orderapplication;

import com.order.orderapplication.controller.SalesController;
import com.order.orderapplication.entity.Members;
import com.order.orderapplication.entity.Sales;
import com.order.orderapplication.repository.SalesRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages ={"com.order.orderapplication.controller","com.order.orderapplication.service",
        "com.order.orderapplication.repository","com.order.orderapplication.entity"})
public class OrderApplication extends SpringBootServletInitializer {

@Override
protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
    return application.sources(OrderApplication.class);

}
    public static void main(String[] args) {

        SpringApplication.run(OrderApplication.class, args);

    }

}
