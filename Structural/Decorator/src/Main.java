public class Main {
    public static void main(String[] args) {
        Pizza italianPepperoniPizza = new PepperoniTopping(new CheeseTopping(new PlainPizza()));
        System.out.println("Pizza: " + italianPepperoniPizza.getDescription());
    }
}
//folosim o clasa wrapper/decorator ce ne permite sa atasam abilitati/comportamente noi
// doar punandu le in aceasta
// deci pe scurt atasam capacitati noi folosind clase Decoratoare ce sunt extinse de subclasele
// ce vor fi create