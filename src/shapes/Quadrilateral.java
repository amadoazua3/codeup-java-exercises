package shapes;

abstract class Quadrilateral extends Shape implements Measurable{

        private double length;
        private double width;

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

    public abstract double setLength();

    public abstract double setWidth();




}
