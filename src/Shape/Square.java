package Shape;

public class Square extends Rectangle {

    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }

    public Square(double side){
        super(side, side);
    }

    public double getSide(){
        return getWidth();
    }
    public void setSide(double side){
        super.setWidth(side);
        super.setHeight(side);
    }

    @Override
    public String toString() {
        return "Shape.Square{" +
                "Side: " +getSide() +
                super.toString() +
                "}";
    }
}
