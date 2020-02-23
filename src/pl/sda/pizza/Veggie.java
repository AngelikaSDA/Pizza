package pl.sda.pizza;

import java.util.List;

public class Veggie implements Pizza, Ingredients{
    private List<String> ingrets;
    private PizzaDough pizzaDough;

    public Veggie(){}
    public Veggie(List<String> ingrets, PizzaDough pizzaDough){
        this.ingrets = ingrets;
        this.pizzaDough = pizzaDough;
    }


    @Override
    public void preparePizza() {
        this.pizzaDough.preparePizzaDough();
        System.out.println("Robię veggie");
    }

    @Override
    public List<String> getIngredients() {
        return this.ingrets;

    }
}
