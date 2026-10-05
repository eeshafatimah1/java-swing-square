package lab3;

/**
 * Abstract base class for all shapes, holding the position of the shape.
 */
public abstract class Shape {
    protected Integer posX; // position of the shape on the x axis
    protected Integer posY; // position of the shape on the y axis

    public Shape(Integer posX, Integer posY) {
        this.posX = posX;
        this.posY = posY;
    }

    public Integer getPosX() {
        return posX;
    }

    public Integer getPosY() {
        return posY;
    }
}
