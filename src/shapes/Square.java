package shapes;

public class Square extends Quadrilateral{


    public Square(double length, double width) {
        super(length, width);
    }

    @Override
    public double setLength() {
        return 0;
    }

    @Override
    public double setWidth() {
        return 0;
    }


//    public Square(int length) {
//        super(length, length);
//    }


}
