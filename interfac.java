@FunctionalInterface
interface  a{
    void show();
    //void display();
}
@FunctionalInterface
interface b{
    void display();
}
public class interfac {
    public static void main(String[] args) {
        a obj =()-> System.out.println("I am from class a");
        b obj1=()-> System.out.println("I am from class b");
        obj.show();
        obj1.display();

    }
}
