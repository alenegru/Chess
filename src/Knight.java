public class Knight extends Piece{

    public Knight(String color) {
        super(color);
    }

    @Override
    public boolean canMove(Square[][] board, Square start, Square end) {
        if (start.piece.isEnemy(end.piece) || end.piece == null) {
            if (Math.abs(start.getX() - end.getX()) == 2) {
                return Math.abs(start.getY() - end.getY()) == 1;
            } else if (Math.abs(start.getY() - end.getY()) == 2) {
                return Math.abs(start.getX() - end.getX()) == 1;
            }
        }
        return false;
    }
}
