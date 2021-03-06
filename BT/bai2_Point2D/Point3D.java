package bai6_kethua.BT.bai2_Point2D;

public class Point3D extends Point2D {
    private float z = 0.0f;

    public  Point3D(){};
    public Point3D(float z) {
        this.z = z;
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }
    public void setZ(float z){
        this.z = z;
    }
    public float getZ(){
        return this.z;
    }
    public void setXYZ(float x, float y, float z){
        setXY(x,y);
        this.z=z;
    }
    public float[] getXYZ(){
          float arr[] = new float[3];
          arr[0]= getX();
          arr[1] = getY();
          arr[2] = z;
        return arr;
    }
    public String toString(){
        return getX()+","+getY()+","+z;
    }
}
