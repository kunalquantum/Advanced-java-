//using Runnable interface we can create anonymous class
// to save the time and make program more efficient we can create an anonymous class
public class anonymous_with_class_object_class {
    public static void main(String[] args) {




        //if we are using the object only one time then we can simple write the definiation inside the parameter of the thread
        //so this method will not need any class object directly instead it will use the class defination instead
        //using lambda expression


        Thread t1 =new Thread(()->

        {
            for (int i =12;i>=0;i--)
            {
                System.out.println("anonymous part 1...'wooo'");
                try{
                    Thread.sleep(3400);
                }catch (Exception e){};
            }
        });
        Thread t2 =new Thread(()->

        {
            for (int i =12;i>=0;i--)
            {
                System.out.println("anonymous part 2...'shooo'");
                try{
                    Thread.sleep(3400);
                }catch (Exception e){};
            }
        });;

        t1.start();
        t2.start();



    }
}
