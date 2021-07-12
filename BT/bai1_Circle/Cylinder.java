package bai6_kethua.BT.bai1_Circle;

public class Cylinder extends Circle{
    private double height;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Cylinder(){};

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getVolume(){
        return getArea()*height;
    }

    public String toString(){
        return " Hinh tru voi chieu cao = "+ height+
                ", co the tich  = " + getVolume()+
                ", duoc ke thua tu " + super.toString();
    }

}
