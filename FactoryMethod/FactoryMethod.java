public class FactoryMethod {
    public static void main(String[] args) {
        Application application = new Application();
        application.initialize("Windows");
        application.run();
    }
}