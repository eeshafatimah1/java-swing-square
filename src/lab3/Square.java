package lab3;

/**
 * A square defined by its position and the length of its sides.
 */
public class Square extends Shape {
    private Integer sideLength;

    public Square(Integer posX, Integer posY, Integer sideLength) {
        super(posX, posY);
        this.sideLength = sideLength;
    }

    public Integer getSideLength() {
        return sideLength;
    }

    public void setLength(Integer sideLength) {
        this.sideLength = sideLength;
    }

    public Integer calcArea() {
        return sideLength * sideLength;
    }
}
