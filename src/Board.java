public class Board {
    Square[][] board = new Square[8][8];

    public Board() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                board[i][j] = new Square(i, j, null);
            }
        }
    }

    public Square getSquare(int posX, int posY) {
        return board[posX][posY];
    }

    public void printBoard() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                Piece piece = getSquare(i, j).getPiece();
                if (piece != null) {
                    if (piece.getColor().equals("white"))
                        System.out.print("W");
                    else
                        System.out.print("B");
                    switch (piece.getClass().toString()) {
                        case "class Pawn" -> System.out.print("P ");
                        case "class Rook" -> System.out.print("R ");
                        case "class Knight" -> System.out.print("K ");
                        case "class Bishop" -> System.out.print("B ");
                        case "class Queen" -> System.out.print("Q ");
                        case "class King" -> System.out.print("King ");
                        default -> System.out.print("0 ");
                    }
                }
                else
                    System.out.print("00 ");
            }
            System.out.println();
        }
    }

    public void checkMove(Square start, int endX, int endY) {
        Piece piece = start.getPiece();
        if (piece != null) {
            switch (piece.getClass().toString()) {
                case "class Pawn" -> System.out.print("Pawn ");
                case "class Rook" -> System.out.print("Rook ");
                case "class Queen" -> System.out.print("Queen ");
                case "class Knight" -> System.out.print("Knight ");
                case "class Bishop" -> System.out.print("Bishop ");
            }
            System.out.println("move from x position: " + start.getX() + " and y position: " +
                    start.getY() + "to x position: " + endX + "and y position: " + endY);

            if (piece.canMove(this.board, start, getSquare(endX, endY)))
                System.out.println(" is valid.");
            else
                System.out.println(" is not valid.");
        } else
            System.out.println("Empty square.");
    }
}
