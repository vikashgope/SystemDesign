package com.designpatterns.decorator;

//abstract decorator

 abstract class   PizzaDecorator implements Pizza{
    protected Pizza pizza ;

    public PizzaDecorator(Pizza pizza)
    {
        this.pizza=pizza;

    }
    @Override
    public abstract String getDescription();

    @Override
     public abstract double getCost();
}
