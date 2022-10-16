class calculateTriangle
{
    public static void main(String arg[])
    {
        Triangle tri = new Triangle(10, 10, 5, 6);

        System.out.println("Height = " + tri.height);
        System.out.println("Base = " + tri.base);
        System.out.println("Side a = "+ tri.side_a);
        System.out.println("Side c = "+ tri.side_c);
        System.out.println("Area = " + tri.getArea());
        System.out.println("Perimeter = " + tri.getPerimeter());

    }
}
