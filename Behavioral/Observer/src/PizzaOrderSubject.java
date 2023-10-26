interface PizzaOrderSubject {
    void attach(PizzaOrderObserver observer);

    void detach(PizzaOrderObserver observer);

    void notifyObservers();
}
