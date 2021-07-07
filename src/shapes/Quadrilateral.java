package shapes;

abstract class Quadrilateral implements Shape{

        protected double length;
        protected double width;

    public Quadrilateral(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public abstract void setLength(double side);

    public abstract void setWidth(double side);

    @Override
    public double getArea() {
        return 2 * (length + width);
    }

    @Override
    public double getPerimeter() {
        return length * width;
    }
}
