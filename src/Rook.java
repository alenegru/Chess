public class Rook extends Piece{
    //String name = String.valueOf(this.getClass());

    public Rook(String color) {
        super(color);
    }

    @Override
    public boolean canMove(Square[][] board, Square start, Square end) {
        int startRow = start.getX();
        int startCol = start.getY();
        int endRow = end.getX();
        int endCol = end.getY();
        if (start.piece.isEnemy(end.piece) || end.piece == null) {
            if (startRow == endRow) {
                if (startCol > endCol) {
                    for (int i = startCol - 1; i > endCol; i--)
                        if (board[startRow][i].piece != null)
                            return false;
                } else {
                    for (int i = startCol + 1; i < endCol; i++)
                        if (board[startRow][i].piece != null)
                            return false;
                }
                return true;
            } else if (startCol == endCol) {
                if (startRow > endRow) {
                    for (int i = startRow - 1; i > endRow; i--)
                        if (board[i][startCol].piece != null)
                            return false;
                } else {
                    for (int i = startRow + 1; i < endRow; i++)
                        if(board[i][startCol].piece != null)
                            return false;
                }
                return true;
            }
        }
        return false;
    }
}
