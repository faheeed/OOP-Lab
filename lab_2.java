import java.util.Scanner;
public class lab_2{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        Rectangle obj=new Rectangle();
        obj.h=scanner.nextInt();
        obj.l=scanner.nextInt();
        obj.area();
        obj.display();
        obj.insertvalue(obj.h,obj.l);

    }
}
class Rectangle{
    int h;
    int l;
    void area()
    {
        System.out.println("Area of rectangle  = "+(h*l));
    }
    void display()
    {
        System.out.println("Hight = "+h+"   length = "+l);
    }
    void insertvalue(int h,int l)
    {
        System.out.println("Hight = "+h+"   length = "+l);

    }

}