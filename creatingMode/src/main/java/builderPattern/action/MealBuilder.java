package builderPattern.action;

import builderPattern.impl.*;

public class MealBuilder {

    public Meal prepareVegMeal(){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNoVerMeal(){
        Meal meal = new Meal();
        meal.addItem(new ChickerBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
