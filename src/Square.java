public class Square {
    private int posX;
    private int posY;
    Piece piece;

    public Square (int posX, int posY, Piece piece) {
        this.posX = posX;
        this.posY = posY;
        this.piece = piece;
    }

    public int getX() {
        return this.posX;
    }

    public int getY() {
        return this.posY;
    }

    public Piece getPiece() {
        return this.piece;
    }

    public void setX(int posX) {
        this.posX = posX;
    }

    public void setY(int posY) {
        this.posY = posY;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }
}
