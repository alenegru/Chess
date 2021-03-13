public class Bishop extends Piece{

    public Bishop(String color) {
        super(color);
    }

    @Override
    public boolean canMove(Square[][] board, Square start, Square end) {
        int startRow = start.getX();
        int startCol = start.getY();
        int endRow = end.getX();
        int endCol = end.getY();

        if (start.piece.isEnemy(end.piece) || end.piece == null) {
            int i;
            int j;
            //move up
            if (startRow > endRow) {
                if (startCol < endCol) {
                    //right
                    for(i = startRow - 1, j = startCol + 1; i > endRow && j < endCol; i--, j++) {
                        if (board[i][j].piece != null)
                            return false;
                        if (i - 1 != endRow && j + 1 != endCol) return false;
                    }
                } else {
                    //left
                    for(i = startRow - 1, j = startCol - 1; i > endRow && j > endCol; i--, j--) {
                        if (board[i][j].piece != null)
                            return false;
                        if (i - 1 != endRow && j - 1 != endCol) return false;
                    }
                }
                //move down
            } else {
                if (startCol < endCol) {
                    //right
                    for(i = startRow + 1, j = startCol + 1; i < endRow && j < endCol; i++, j++) {
                        if (board[i][j].piece != null)
                            return false;
                        if (i + 1 != endRow && j + 1 != endCol) return false;
                    }
                } else {
                    //left
                    for(i = startRow + 1, j = startCol - 1; i < endRow && j > endCol; i++, j--) {
                        if (board[i][j].piece != null)
                            return false;
                        if (i + 1 != endRow && j - 1 != endCol) return false;
                    }
                }
            }
            return true;
        }
        return false;
    }
}
