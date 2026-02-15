package com.designpatterns.decorator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DecoratorApplication {

    public static void main(String[] args) {


        Pizza pizza = new MargheritaPizza();
        System.out.println(pizza.getDescription() + " Costs Rs." + pizza.getCost());
        pizza = new ExtraCheese(pizza);     // extracheese is ulitamely pizza object
        System.out.println(pizza.getDescription() + " Costs Rs." + pizza.getCost());
        pizza = new ExtraPaneer(pizza);
        System.out.println(pizza.getDescription() + " Costs Rs." + pizza.getCost());



//  Pizza pz=new ExtraCheese(new ExtraPaneer(new MargheritaPizza()));

    }

}
