package com.designpatterns.decorator;

public class ExtraCheese extends PizzaDecorator{



    //important see it properly
    public ExtraCheese(Pizza pizza)
    {
        super(pizza);
    }

    @Override
    public String getDescription()
    {
        return pizza.getDescription() + " with extra cheese";
    }
    @Override
    public double getCost()
    {
        return pizza.getCost() + 40;
    }

}
