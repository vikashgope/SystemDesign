package com.designpatterns.decorator;

public class ExtraPaneer extends PizzaDecorator{

   public  ExtraPaneer(Pizza pizza)
    {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " with extra paneer";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 50;
    }


}
