public class PizzaStore {
    private PizzaFactory factory;
    private Pizza pizza;

    public PizzaStore(PizzaFactory factory) {
        this.factory = factory;
    }

    public void createCheesePizza() {
        pizza = factory.createCheesePizza();
    }
    public void createPepperoniPizza() {
        pizza = factory.createPepperoniPizza();
    }

    public void bakePizza() {
        pizza.bake();
    }
}