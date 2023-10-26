public class Main {
    public static void main(String[] args) {
        RoundHole hole = new RoundHole(5);
        RoundPeg rpeg = new RoundPeg(5);
        if (hole.fits(rpeg)) {
            System.out.println("Round peg r5 fits round hole r5.");
        }

        SquarePeg smallSqPeg = new SquarePeg(2);
        SquarePeg largeSqPeg = new SquarePeg(20);
        // hole.fits(smallSqPeg); // Won't compile.

        // Adapter solves the problem.
        SquarePegAdapter smallSqPegAdapter = new SquarePegAdapter(smallSqPeg);
        SquarePegAdapter largeSqPegAdapter = new SquarePegAdapter(largeSqPeg);
        if (hole.fits(smallSqPegAdapter)) {
            System.out.println("Square peg w2 fits round hole r5.");
        }
        if (!hole.fits(largeSqPegAdapter)) {
            System.out.println("Square peg w20 does not fit into round hole r5.");
        }
    }
}
// dupa cum indica si imaginea de pe refactoring guru
// folosim un obiect pentru a extinde obiectul final ca sa poata accepta si
// alte tipuri de obiecte
//adica folosim o clasa ce extinde clasa destinatie si ii da override la metode pentru
//a adapta clasa sursa/obiectul sursa la aceasta in cazul in care ar putea fi compatibil
// EX: Ingredients -> new PizzaAdapter(ingredients)/new SushiAdapter(ingredients) ->
// -> Client.request(ingredientsPizzaAdapter)/Client.request(ingredientsSushiAdapter)