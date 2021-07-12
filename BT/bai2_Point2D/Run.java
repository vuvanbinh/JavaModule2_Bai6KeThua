package bai6_kethua.BT.bai2_Point2D;

public class Run {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(2,3);
        System.out.println(point2D);

        Point3D point3D = new Point3D(1,2,3);
        System.out.println(point3D);

        for (float r: point3D.getXYZ()
             ) {
            System.out.println(r);
        }
    }
}
