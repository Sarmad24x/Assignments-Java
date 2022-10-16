
class Triangle
{
    int height;
    int base;// base is also considered as side b
    int side_a;
    int side_c;

    Triangle(int h, int b,int a,int c)
    {
        this.height = h;
        this.base = b;
        this.side_a = a;
        this.side_c = c;
    }

    int getArea()
    {
        return (height * base)/2;
    }

    int getPerimeter()// to get perimeter we calculate the sum of all sides of a triangle
    {
        return side_a + base + side_c;
    }
}