public class PizzaItalianaFactory implements PizzaFactory {
    public Pizza createCheesePizza() {
        return new ItalianCheesePizza();
    }

    public Pizza createPepperoniPizza() {
        return new ItalianPepperoniPizza();
    }
}
