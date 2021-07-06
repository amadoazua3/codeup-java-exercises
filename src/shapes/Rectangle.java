package shapes;

public class Rectangle extends Quadrilateral implements Shape{


    public Rectangle(double length, double width) {
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
