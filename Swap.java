/* Name : Sarmad Sajjad
Roll No : 14
 */

//Assignment : Swapping Value Using Reference

class M
{
    public static void main(String[]args)
    {
        test t = new test(90);
        System.out.println("Value Stored Before = " + t.x);
        change (t);
        System.out.println("Value after Swapping = " + t.x);
    }
    public static void change (test t)
    {
        t.x=44;
    }
}