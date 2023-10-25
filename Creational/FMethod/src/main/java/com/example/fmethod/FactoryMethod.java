package com.example.fmethod;

public class FactoryMethod {
    public static void main(String[] args) {
        Application application = new Application();
        application.initialize("Windows");
        application.run();
        Application application2 = new Application();
        application.initialize("Web");
        application.run();
    }
}
// vai doamne multa durere de cap ii cu maven
// Factory Method presupune crearea unei interfate ce prezinta metoda basic dar permite
// ca subclasele sa returneze lucruri diferite, diferentierea fiind facuta la creare/initializare
// Ex : a.cook("Cheddar Pizza") -> class Cooker{..if(Chedder Pizza)..new CheedarPizza} -> addCheese("Cheddar")
// sau cv de genu
// ~~tot la exemplu interface Pizza { addCheese()} putea fi si Mozzarella sau idk, ideea e ca avem un
// factory ce poate creea orice tip de obiect folosind interfata si metodele ce o suprascriu