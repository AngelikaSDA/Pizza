package pl.sda.pizza;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Pizza> pizzaList = new ArrayList<>();

        List<String> ingredients = Arrays.asList("czosnek", "szynka");

        GlutenFree glutenFree = new GlutenFree();
        Hawaiian hawaiian = new Hawaiian(ingredients, glutenFree);

        pizzaList.add(hawaiian);
        hawaiian.preparePizza();

    }
}
