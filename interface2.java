import java.util.*;
@FunctionalInterface
interface  a{
    void show();
    //void display();
}
@FunctionalInterface
interface b{
    void display();
}
public class interface2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value for the radius :");

        int a= sc.nextInt();
        System.out.println("enter the value foe the mean:");
        int b=sc.nextInt();

        a obj =()-> System.out.println("from class a we get area of circle "+ 3.14*a*a);
        b obj1=()-> System.out.println("I am from class b we get profit"+ b+b+(2.23*b));
        obj.show();
        obj1.display();

    }
}
