public class PepperoniPizzaBuilder implements PizzaBuilder {
    private Pizza pizza;

    public PepperoniPizzaBuilder() {
        pizza = new Pizza("Pepperoni Pizza");
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