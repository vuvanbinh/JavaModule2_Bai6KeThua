package bai6_kethua.BT.bai2_Point2D;

public class Point2D {
    private float x = 0.0f;
    private float y = 0.0f;
    private float arr[] = new float[2];


    public Point2D(){};
    public Point2D(float x, float y){
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x , float y){
        this.x = x;
        this.y = y;
    }
   public float[] getXY(){
        arr[0]= x;
        arr[1] = y;
        return arr;
    }

    @Override
    public String toString() {
        return "Point2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
