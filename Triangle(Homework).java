package Class_4;
//Name: Sarmad Sajjad
//Roll No: 14
class Triangle
{
    float perpendicular, base, hypot ;
    Triangle()
    {
        perpendicular = 2.3f;
        base = 5.4f;
        hypot = 8.4f;
    }
    Triangle(float perp, float bs, float hyp)
    {
        perpendicular = perp;
        base = bs;
        hypot=hyp;
    }
    float sin()
    {
        return perpendicular/hypot;
    }
    float cos()
    {
        return base/hypot;
    }
    float tan()
    {
        return perpendicular/base;
    }
}
class TestTriangle
{
    public static void main(String[] args)
    {
        //For Default Constructor
        Triangle t1= new Triangle();
        System.out.println(" SIN = "+t1.sin());
        System.out.println(" COS = "+t1.cos());
        System.out.println(" TAN = "+t1.tan());

        //For Second Constructor
        Triangle t2= new Triangle(2.0f,3.0f,4.0f);
        System.out.println(" SIN = "+t2.sin());
        System.out.println(" COS = "+t2.cos());
        System.out.println(" TAN = "+t2.tan());

    }
}