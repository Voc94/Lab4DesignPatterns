public class Main {
    public static void main(String[] args) {
        PizzaChef pizzaChef = new PizzaChef();
        boolean isVegan = true;
        if (isVegan) {
            pizzaChef.setBakingStrategy(new VeganPizzaStrategy());
        } else {
            pizzaChef.setBakingStrategy(new NonVeganPizzaStrategy());
        }
        pizzaChef.bakePizza();
    }
}
// pe scurt avem o strategie si o clasa care o aplica,
// EX : context.setStrategy(new ConcreteAddStrategy)
// de folos cand vrem sa folosim difere path-uri de aplicabilitate