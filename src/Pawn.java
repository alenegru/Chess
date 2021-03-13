public class Pawn extends Piece {

    public Pawn(String color) {
        super(color);
    }

    @Override
    public boolean canMove(Square[][] board, Square start, Square end) {
        if (start.getY() == end.getY()) {
            if (end.piece == null) {
                if (start.getX() == 6 && start.getX() - end.getX() < 3) {
                    return true;
                } else return start.getX() != 6 && start.getX() - end.getX() < 2;
            }
        } else if (Math.abs(start.getX() - end.getX()) == 1 && Math.abs(start.getY() - end.getY()) == 1){
            return start.piece.isEnemy(end.piece);
        }
        return false;
    }
}
