package shapes;

public class Rectangle extends Quadrilateral {



    public Rectangle(double side) {
        super(side, side);
    }

    @Override
    public void setLength(double side) {

        this.length = side;

    }

    @Override
    public void setWidth(double side) {

        this.width = side;

    }


//    private int length;
//    private int width;
//
//    public Rectangle(int length, int width) {
//        this.length = length;
//        this.width = width;
//    }
//
//    public int getArea(){
//        return this.length * this.width;
//    }
//
//    public int getPerimeter(){
//        return 2 * (this.length + this.width);
//    }


}
