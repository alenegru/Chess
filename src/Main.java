public class Main {
    public static void main(String[] args) {
        System.out.println("Chess");

        Board board = new Board();
        board.board[0][0] = new Square(0, 0, new Rook("white"));
        board.board[1][5] = new Square(0, 7, new Rook("white"));
        board.board[0][2] = new Square(1, 2, new Knight("black"));
        board.board[5][4] = new Square(5, 4, new Knight("black"));
        board.board[5][5] = new Square(5, 5, new Knight("black"));
        board.board[2][3] = new Square(3, 3, new Bishop("black"));
        board.board[5][7] = new Square(3, 3, new Bishop("white"));
        board.board[1][2] = new Square(2, 2, new Queen("white"));
        board.board[3][1] = new Square(6, 1, new Pawn("white"));
        board.board[4][3] = new Square(1, 3, new Bishop("black"));
        board.board[6][6] = new Square(6, 6, new Pawn("white"));

        board.printBoard();
        //black knight attacks white pawn
        board.checkMove(board.getSquare(5,4),6,6);

        // black bishop attacks knight but have the same color
        board.checkMove(board.getSquare(4,3),5,4);

        //white queen attacks black bishop
        board.checkMove(board.getSquare(1,2),2,3);

        //white pawn moves diagonally to attack black knight
        board.checkMove(board.getSquare(6,6),5,5);

        //empty spot move
        board.checkMove(board.getSquare(7,0), 4, 4);
    }
}
