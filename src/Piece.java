import java.sql.Struct;

public abstract class Piece {
    private boolean kingInCheck = false;
    private String color = "white";

    public void setInCheck(boolean inCheck) {
        this.kingInCheck = inCheck;
    }

    public boolean isKingInCheck() {
        return kingInCheck;
    }

    public Piece(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isWhite() {
        return this.color.equals("white");
    }

    public boolean isBlack() {
        return this.color.equals("black");
    }

    public boolean isEnemy(Piece piece) {
        return !piece.color.equals(this.color);
    }

    public abstract boolean canMove(Square[][] board, Square start, Square end);

    public boolean isKing(Square end) {
        if (end.piece instanceof King && !end.piece.getColor().equals(this.getColor())) {
            end.piece.setInCheck(true);
            return true;
        }
        return false;
    }
}
