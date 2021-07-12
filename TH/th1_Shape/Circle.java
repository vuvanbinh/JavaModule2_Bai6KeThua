package bai6_kethua.TH.th1_Shape;

public class Circle extends Shape {
    private double radius;

    public Circle(){
        radius = 1.0;
    };
    public  Circle (double radius){
        this.radius = radius;
    }
    public Circle (double radius, String color, boolean filled){
        super(color,filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return radius * radius * Math.PI;
    }
    public double getPerineter(){
        return 2*radius*Math.PI;
    }
    @Override
    public String toString(){
        return "A Cirvle with radius = "
                + getRadius()
                + ", which is a subclass of \n"
                + super.toString();
    }
}
