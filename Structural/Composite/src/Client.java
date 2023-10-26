public class Client {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape square = new Square();


        CompositeShape group = new CompositeShape();
        group.add(circle);
        group.add(square);

        circle.draw();
        square.draw();
        group.draw();
        // destul de straight forward pe scurt folosind liste si o interfata comuna parcurgem
        // tot grupul si il afisam/facem metoda comuna, functioneaza doar cand totul poate fi
        // modelat ca un tree, sau mai pe romaneste cand avem un grup comun
    }
}