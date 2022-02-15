public class Test {
    public static void main(String[] args) {
        Point2D p1 = new Point2D(11,1);
        System.out.println(p1);

        Point2D p2 = new Point3D(11,1,5);
        System.out.println(p2);

        Point3D p3 = new Point3D(5,1,11);
        System.out.println(p3);

        float[] xyz = ((Point3D) p2).getXYZ();
        float x = xyz[0];
        System.out.println(x);
    }
}
