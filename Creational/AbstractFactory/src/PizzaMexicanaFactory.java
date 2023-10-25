public class PizzaMexicanaFactory implements PizzaFactory{
    public Pizza createCheesePizza() {
        return new MexicanCheesePizza();
    }

    public Pizza createPepperoniPizza() {
        return new MexicanPepperoniPizza();
    }
}
