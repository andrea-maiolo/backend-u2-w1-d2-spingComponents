package com.epicode.U5D1.runner;

import com.epicode.U5D1.entities.Menu;
import com.epicode.U5D1.entities.Order;
import com.epicode.U5D1.entities.Table;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("application.properties")
public class MyRunner implements CommandLineRunner {

    @Autowired
    private Menu menu;


    @Value("${coperto.value}")
    private double coperto;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("running");
        Table nt = new Table(2, 4);
        System.out.println(nt);
        System.out.println(coperto);


        Order no = new Order(nt, 3, coperto);
//        no.addToOrder(menu.getPizzaList().get(1));
//        no.addToOrder(menu.getDrinkList().get(2));
        System.out.println(no);

    }
}
