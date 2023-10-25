public class PizzaShop {
    public static void main(String[] args) {
    PizzaFactory factory1 = new PizzaMexicanaFactory();
    PizzaFactory factory2 = new PizzaItalianaFactory();

        PizzaStore store1 = new PizzaStore(factory1);
        store1.createCheesePizza();
        store1.bakePizza();
        store1.createPepperoniPizza();
        store1.bakePizza();

        PizzaStore store2 = new PizzaStore(factory2);
        store2.createCheesePizza();
        store2.bakePizza();
        store2.createPepperoniPizza();
        store2.bakePizza();
    }
    // pe foarte scurt abstract factory presupune definirea de interfete pentru toate variantele posibila
    // astfel permitand o gama variata de produse pe scurt interfete ce evita tight cupling,
}