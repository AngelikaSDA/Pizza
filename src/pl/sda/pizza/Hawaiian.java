package pl.sda.pizza;

import java.util.List;

public class Hawaiian implements Pizza, Ingredients {
    private List<String> ingrets;
    private PizzaDough pizzaDough;

    public Hawaiian(){}
    public Hawaiian(List<String> ingrets, PizzaDough pizzaDough){
        this.ingrets = ingrets;
        this.pizzaDough = pizzaDough;
    }

    @Override
    public void preparePizza() {
        this.pizzaDough.preparePizzaDough();
        System.out.println("Robię hawajską");
    }

    @Override
    public List<String> getIngredients() {
        return this.ingrets;
    }
}
