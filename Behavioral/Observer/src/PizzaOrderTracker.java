import java.util.ArrayList;
import java.util.List;

// The ConcreteSubject stores state and sends notifications to observers.
class PizzaOrderTracker implements PizzaOrderSubject {
    private List<PizzaOrderObserver> observers = new ArrayList<>();
    private String pizzaStatus;

    public void setPizzaStatus(String status) {
        pizzaStatus = status;
        notifyObservers();
    }

    public void attach(PizzaOrderObserver observer) {
        observers.add(observer);
    }

    public void detach(PizzaOrderObserver observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (PizzaOrderObserver observer : observers) {
            observer.update(pizzaStatus);
        }
    }
}