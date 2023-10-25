//gasit pe net ofc
 class Main {
    public static void main(String[] args) {
        Director director = new Director();
        PizzaBuilder builder = new PepperoniPizzaBuilder();
        director.makePeperoniPizza(builder);
        Pizza pizza = builder.getResult();
        System.out.println(pizza.getPizzaType());

        builder = new VeganPizzaBuilder();
        director.makeVeganPizza(builder);
        pizza = builder.getResult();
        System.out.println(pizza.getPizzaType());
    }
}
// pe scurt Design Pattern-ul Creational Builder Desi creste complexitatea proiectului ofera o tehnica
// relativ la punct de a crea obiecte ce pot contine o varietatea mare de adaosu-ri/particularitati specifice
// de asemenea folosind un Director permitem ca metodele necesare de creare a obiectului sa nu poata fi
// vazute de client