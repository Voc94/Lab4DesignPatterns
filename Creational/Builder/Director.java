public class Director {
    public void makePeperoniPizza(PizzaBuilder builder) {
        builder.buildDough();
        builder.buildSauce();
        builder.buildToppings();
    }

    public void makeVeganPizza(PizzaBuilder builder) {
        builder.buildDough();
        builder.buildSauce();
        builder.buildToppings();
    }
}