public class King extends Piece {
    // Square[] checkSquares = new Square[8];

    public King(String color) {
        super(color);
    }

    @Override
    public boolean canMove(Square[][] board, Square start, Square end) {
//        for (Square square: checkSquares) {
//            if (end == square) {
//                return false;
//            }
//        }
        if (start.piece.isEnemy(end.piece) || end.piece == null) {
            if (start.getX() == end.getX()) {
                return Math.abs(start.getY() - end.getY()) == 1;
            } else if (start.getY() == end.getY()) {
                return Math.abs(start.getX() - end.getX()) == 1;
            } else return Math.abs(start.getX() - end.getX()) == 1 && Math.abs(start.getY() - end.getY()) == 1;
        }
        return false;
    }
}
