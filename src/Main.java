public class Main {

    // The constructor for the class Board is excessively big, most of the parameters are never used.
    // Could you implement the Builder pattern to provide a simple interface?
    public static void main(String[] args) {
        System.out.println("Let's create a simple board");
        Board board = new Board(12, 8, 20, null, 0, true, false, 0);

        System.out.println("The created board has " + board.getHeight() * board.getWidth() + " cells");
    }


}
