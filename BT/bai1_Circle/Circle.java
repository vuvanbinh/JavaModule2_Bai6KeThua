package bai6_kethua.BT.bai1_Circle;

public class Circle {
    private double radius;
    private String color ;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public Circle(){};

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }
    public double getArea(){
        return radius*radius*Math.PI;
    }

    @Override
    public String toString() {
        return "Hinh tron voi ban kinh = "+radius+
                ", mau : " + color +
                ", co dien tich =  "+
                getArea();
    }
}
