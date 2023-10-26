public class Main {
    public static void main(String[] args) {
        PizzaChef pizzaChef = new PizzaChef();

        PizzaCommand margheritaCommand = new MakeMargheritaPizzaCommand();
        PizzaCommand pepperoniCommand = new MakePepperoniPizzaCommand();
        PizzaCommand vegetarianCommand = new MakeVegetarianPizzaCommand();

        pizzaChef.setCommand(margheritaCommand);
        pizzaChef.executeCommand();

        pizzaChef.setCommand(pepperoniCommand);
        pizzaChef.executeCommand();

        pizzaChef.setCommand(vegetarianCommand);
        pizzaChef.executeCommand();
    }
}
// avem o clasa abstracta ce defineste o metoda abstracta ce trebuie neaparat suprascrisa
// deci avem o comanda pe care i o dam unui executor ce o executa dupa tipul comenzi pe care
// i am dat o
// ex: client.request() -> pizzaChef.setCommand(client.request().ToCommand()) ->
// -> pizzaChef.executeCommand() -> "Pizza" + (whatever the client requested)
