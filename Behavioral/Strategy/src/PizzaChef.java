public class PizzaChef {
    private PizzaBakingStrategy strategy;

    public void setBakingStrategy(PizzaBakingStrategy strategy) {
        this.strategy = strategy;
    }

    public void bakePizza() {
        strategy.bakePizza();
    }
}