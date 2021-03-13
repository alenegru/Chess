public class Queen extends Piece{
    public Queen(String color) {
        super(color);
    }

    @Override
    public boolean canMove(Square[][] board, Square start, Square end) {
        int startRow = start.getX();
        int startCol = start.getY();

        Bishop bishop = new Bishop(start.piece.getColor());
        board[startRow][startCol] = new Square(startRow, startCol, bishop);
        boolean bishopMove = board[startRow][startCol].piece.canMove(board, start, end);

        Rook rook = new Rook(start.piece.getColor());
        board[startRow][startCol] = new Square(startRow, startCol, rook);
        boolean rookMove = board[startRow][startCol].piece.canMove(board, start, end);

        return bishopMove || rookMove;
    }
}
