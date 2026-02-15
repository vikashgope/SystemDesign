package com.designpatterns.decorator;

//abstract decorator

 abstract class   PizzaDecorator implements Pizza{
    protected Pizza pizza ;

    public PizzaDecorator(Pizza pizza)
    {
        this.pizza=pizza;

    }
    @Override
    public String getDescription()
     {
         return "Pizza";
     }
     @Override
     public double getCost()
     {
         return 100;
     }
}
