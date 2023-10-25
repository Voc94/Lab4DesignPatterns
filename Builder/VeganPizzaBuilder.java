public class VeganPizzaBuilder implements PizzaBuilder {
    private Pizza pizza;

    public VeganPizzaBuilder() {
        pizza = new Pizza("Vegan Pizza");
    }

    @Override
    public void buildDough() {
    }

    @Override
    public void buildSauce() {
    }

    @Override
    public void buildToppings() {
    }

    @Override
    public Pizza getResult() {
        return pizza;
    }
}