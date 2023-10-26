public class CheeseTopping extends ToppingDecorator {
    public CheeseTopping(Pizza pizza) {
        super(pizza);
    }

    public String getDescription() {
        return pizza.getDescription() + " Cheese";
    }
}