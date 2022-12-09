
//abstract class -> define and declare
//interface -> dont allowed the declaration till 1.7 after that
//from version 1.8 define method in interface

interface demo// abstract class which is an interface
{
    public void define();
    default void declare()  //default method allows the method definations
    {
        System.out.println("i am the defination of declare  INSIDE THE INTERFACE  ");
    }

}

class demoimplements implements demo
{
    public void define()
    {
        System.out.println("i am defination an ordinary method defined in an imolemented class  OUTSIDE THE INTERFACE");
    }

}

public class default_Interface {
    public static void main(String[] args) {
        demoimplements obj = new demoimplements();
        obj.define();
        obj.declare();

    }
}
