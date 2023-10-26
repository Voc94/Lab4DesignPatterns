class Customer implements PizzaOrderObserver {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    public void update(String pizzaStatus) {
        System.out.println(name + ": My pizza is " + pizzaStatus);
    }
}
