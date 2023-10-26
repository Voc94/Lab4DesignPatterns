class Main {
    public static void main(String[] args) {
        PizzaOrderTracker orderTracker = new PizzaOrderTracker();

        Customer customer1 = new Customer("Alice");
        Customer customer2 = new Customer("Bob");

        orderTracker.attach(customer1);
        orderTracker.attach(customer2);

        orderTracker.setPizzaStatus("preparing");
        orderTracker.setPizzaStatus("baking");
        orderTracker.setPizzaStatus("out for delivery");
    }
}
//avem un concrete observer care e atasat unui tracker care care este notificat de el
// pe scurt  Tracker.attach(client); if condition then notify -> client
// si o structura de date de observere

